--ghc 8.0.2
-- https://rextester.com/l/haskell_online_compiler
import qualified Data.Map.Strict as Map
import Data.Function ((&))
import Data.List

--   +   
--   |  +
-- y | / z
--   |/
--   +----+
--      x

ex1 = [(0,0,0), (1,0,0), (2,0,0), (2,1,0), (1,2,0)]

input = [(0,1,0),(0,2,0),(0,3,0),(0,4,0),(0,7,0),(1,5,0),(1,6,0),(1,7,0),(2,1,0),(2,4,0),(2,5,0),(3,1,0),(3,2,0),(3,3,0),(3,5,0),(3,6,0),(4,2,0),(4,3,0),(4,7,0),(5,1,0),(5,2,0),(5,4,0),(5,5,0),(6,0,0),(6,2,0),(6,4,0),(6,5,0),(7,3,0),(7,4,0),(7,5,0),(7,7,0)]

alive_neighbours :: [(Int, Int, Int)] -> (Int, Int, Int) -> Int
alive_neighbours cubes (x,y,z) = 
    let is_neighbour (xc,yc,zc) = abs(xc-x) <= 1 && abs(zc-z) <= 1 && abs(yc-y) <= 1  -- the cell is also a neighbour so...
        itself = case (elem (x,y,z) cubes) of
                    True -> 1 -- ... we must substract 1 when it is alive
                    False -> 0
    in (length $ filter is_neighbour cubes) - itself

apply_state_rule :: [(Int, Int, Int)] -> (Int, Int, Int) -> Int -> Bool -- is cell alive after applying rules ?
apply_state_rule cubes cell nb_alives_neighs = 
    case (elem cell cubes) of  -- check if is already active
        True -> nb_alives_neighs == 2 || nb_alives_neighs ==3
        False -> nb_alives_neighs == 3

get_ranges :: [(Int, Int, Int)] -> ((Int, Int),(Int, Int),(Int, Int)) -- range of cells for simulating next round
get_ranges cubes = 
    let range f = let xs = map f cubes
                  in (minimum xs -1, maximum xs +1)
    in (range (\(x,_,_) -> x), range (\(_,y,_) -> y), range (\(_,_,z) -> z))

next_round :: [(Int, Int, Int)] -> [(Int, Int, Int)] -- get next round alive cells based on current alive cells
next_round cubes =
    let ((minx,maxx),(miny,maxy),(minz,maxz)) = get_ranges cubes
        cells = [(x,y,z) | x <- [minx..maxx],
                           y <- [miny..maxy],
                           z <- [minz..maxz]]
    in filter (\c -> apply_state_rule cubes c $ alive_neighbours cubes c) cells 
   
simulate_cycles :: Int -> [(Int, Int, Int)] -> [(Int, Int, Int)] -- simulate n rounds
simulate_cycles 0 cubes = cubes
simulate_cycles n cubes = simulate_cycles (n-1) (next_round cubes)

-- PART 2 avec Benoît

next_round' cubes =
    let adjacents (w,x,y,z) = [(ww,xx,yy,zz) | ww <- [w-1..w+1],
                                               xx <- [x-1..x+1],
                                               yy <- [y-1..y+1],
                                               zz <- [z-1..z+1]] 
                            & filter (/=(w,x,y,z)) 
        --
        updateMap Nothing = Just 1
        updateMap (Just x)  = Just (x+1)
        --
        keepalive _ 3 = True
        keepalive k 2 = elem k cubes
        keepalive _ _ = False
        --
    in  (cubes >>= adjacents)  -- >>= equivalent flatMap for lists
        & foldl' (\m c -> Map.alter updateMap c m) Map.empty 
        & Map.filterWithKey keepalive 
        & Map.keys

simulate_cycles' 0 cubes = cubes
simulate_cycles' n cubes = simulate_cycles' (n-1) (next_round' cubes)

to4d cubes = map (\(x,y,z) -> (x,y,z,0)) cubes

main = print $ length $ simulate_cycles' 6 (to4d input)
