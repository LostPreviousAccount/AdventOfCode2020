-module(day22).
-author("Domo-kun").

%% API
-export([entry_point/0]).

ex1() -> "Player 1:
9
2
6
3
1

Player 2:
5
8
4
7
10".

input() -> "Player 1:
1
10
28
29
13
11
35
7
43
8
30
25
4
5
17
32
22
39
50
46
16
26
45
38
21

Player 2:
19
40
2
12
49
23
34
47
9
14
20
24
42
37
48
44
27
6
33
18
15
3
36
41
31".

parseInput(Str) ->
  [[_ | Deck1], [_ | Deck2]] = lists:map(fun(List) ->
    string:split(List, "\r\n", all) end, string:split(Str, "\r\n\r\n")),
  {lists:map(fun(L) -> list_to_integer(L) end, Deck1), lists:map(fun(L) -> list_to_integer(L) end, Deck2)}.

play([], P2Deck) -> P2Deck;
play(P1Deck, []) -> P1Deck;
play([H1 | T1], [H2 | T2]) ->
  if
    H1 > H2 ->
      play(T1 ++ [H1, H2], T2);
    true -> % else
      play(T1, T2 ++ [H2, H1])
  end.

score(Deck) ->
  calc_score(Deck, length(Deck), 0).

calc_score([], _, Acc) -> Acc;
calc_score([H | T], X, Acc) -> calc_score(T, X - 1, Acc + (X * H)).

solution1(Input) ->
  {Deck1, Deck2} = parseInput(Input),
  Winner = play(Deck1, Deck2),
  %io:fwrite("~w~n", [Winner]),
  io:fwrite("~w", [score(Winner)]).

%%% PART 2

rule1(RoundsDeck, CurrentRoundDeck) -> lists:any(fun(L) -> L == CurrentRoundDeck end, RoundsDeck).

rule2([], _, _, false) -> p2;
rule2(_, [], _, false) -> p1;
rule2([], D2, _, true) -> D2;
rule2(D1, [], _, true) -> D1;
rule2(D1, D2, Histo, Game1) -> rule3(D1, D2, Histo, Game1).

rule3([H1 | T1], [H2 | T2], Histo, Game1) ->

  if
    ((H1 =< length(T1)) and (H2 =< length(T2))) ->
      case play2(lists:sublist(T1, H1), lists:sublist(T2, H2), [], false) of
        p1 -> play2(T1 ++ [H1, H2], T2, [{[H1 | T1], [H2 | T2]} | Histo], Game1);
        p2 -> play2(T1, T2 ++ [H2, H1], [{[H1 | T1], [H2 | T2]} | Histo], Game1)
      end; % sub party
    true ->
      if
        H1 > H2 -> play2(T1 ++ [H1, H2], T2, [{[H1 | T1], [H2 | T2]} | Histo], Game1);
        true -> play2(T1, T2 ++ [H2, H1], [{[H1 | T1], [H2 | T2]} | Histo], Game1)
      end
  end.

play2(Deck1, Deck2, History, true) ->
  %io:fwrite("~w~n", [Deck1]),
  %io:fwrite("~w~n---~n", [Deck2]),
  %io:fwrite("~w~n", [History]),
  case rule1(History, {Deck1, Deck2}) of
    true -> Deck1;
    false -> rule2(Deck1, Deck2, History, true)
  end;
play2(Deck1, Deck2, History, false) ->
  case rule1(History, {Deck1, Deck2}) of
    true -> p1;
    false -> rule2(Deck1, Deck2, History, false)
  end.

solution2(Input) ->
  {Deck1, Deck2} = parseInput(Input),
  Winner = play2(Deck1, Deck2, [], true),
  %io:fwrite("~w~n", [Winner]),
  io:fwrite("~w", [score(Winner)]).

entry_point() ->
  %solution1(input()).
  solution2(input()).
