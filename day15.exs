#Elixir 1.10.2
# did on local because it takes a little bit of time (~1mn)

ex1 = [0,3,6]
ex2 = [3,2,1]
input = [1,0,15,2,10,13]

defmodule Solution do
    def solve(list, stop_round) do
        acc = Enum.reverse(list)
        next_round(acc, stop_round - Enum.count(list))
    end

    def next_round([head | _], 0) do
        head
    end
    
    def next_round([head | tail], remaining_rounds) do
        occ = Enum.find_index(tail, fn x -> x == head end)
        if rem(remaining_rounds, 50000) == 0 do
            IO.inspect [NaiveDateTime.utc_now," - ", remaining_rounds]
        end
        #IO.inspect [head, " in ", [head | tail], " --> ", occ]
        case occ do
            nil -> next_round([0 | [head | tail]], remaining_rounds-1)  # item not found is list -> 0
            a -> next_round([a+1 | [head | tail]], remaining_rounds-1)  # +1 because index starts at 0
        end
    end
    
    # PERF ATTEMPT FOR 2ND PART
    
    def solve2(list, stop_round) do
        number = List.last(list)
        map = init_map(list, %{}, 1)
        # IO.inspect map
        next_round2(number, map, map_size(map)+1, stop_round)
    end
    
    def init_map([_ | []], map, _) do
        map
    end
    
    def init_map([head | tail], map, i) do
        init_map(tail, Map.put(map, head, i), i+1)
    end
    
    def next_round2(head, _, x, x) do
        head
    end
    
    def next_round2(head, map, cur_round, stop_round) do
        occ = map[head]
        if rem(cur_round, 5000000) == 0 do
            IO.inspect [NaiveDateTime.utc_now," - ", cur_round]
        end
        # IO.inspect [cur_round, head, map]
        case occ do
            nil -> next_round2(0, Map.put(map, head, cur_round), cur_round+1, stop_round) # add keyvalue head:1 to occurences map
            _ -> next_round2(cur_round-occ, %{map | head => cur_round}, cur_round+1, stop_round) # reinit head value to 1 
        end        
    end
    
end

IO.puts Solution.solve2(input, 30000000)
# IO.puts Solution.solve2(input, 2020)
