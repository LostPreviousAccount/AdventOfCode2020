;;clojure 1.9.0
;; https://rextester.com/l/clojure_online_compiler

(def s "939
7,13,x,x,59,x,31,19")

(def s2 "939
1789,37,47,1889")

(def s3 "939
67,7,59,61")

(def input "1008169
29,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,41,x,x,x,37,x,x,x,x,x,653,x,x,x,x,x,x,x,x,x,x,x,x,13,x,x,x,17,x,x,x,x,x,23,x,x,x,x,x,x,x,823,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,19")

(defn solution1 [in]
  (def lines (clojure.string/split-lines in)) ;; 2 lines
  (def timestamp (Integer/parseInt (get lines 0)))
  (def buses (map #(Integer/parseInt %) (filter #(not= "x" %) (clojure.string/split (get lines 1) #",")))) ;; split ',' -> remove 'x' -> cast to int  
  (loop [f []
         i 0]
    (if (> (count f) 0)
      (* (first f) (- i 1)) ;; get the first bus / because we inc i when we found a bus
      (recur (filter #(= 0 (rem (+ timestamp i) %)) buses) ;; a bus depart at time timestamp+i if timestamp+i % bus = 0
             (inc i))
    )
  )
)

;;(println (solution1 input))

(defn nextall [bb
               initt
               incr]
  (loop [f false
         i initt]
    (if (true? f)
      (- i incr)
      (recur (every? true? (map (fn [itm] (= 0 (rem (+ (first itm) i) (second itm)))) bb)) ;; for every bus, is (timestamp + i + bus_index) % bus = 0 ?
             (+ i incr)) ;; optim so max bus always true
    )
  )
)

(defn solution2 [in t]
  (def buses (lazy-seq (map #(Integer/parseInt %) 
                  (clojure.string/split 
                       (clojure.string/replace (get (clojure.string/split-lines in) 1)
                                               "x"  
                                               "1") 
                   #","))))
  (def bb (filter #(not= 1 (second %)) (map-indexed (fn [idx itm] [idx itm]) buses))) ;; soit [0 17] [2 13] [3 19]
  ;;(println initt)  
  (loop [f (rest bb)
         i t
         c [(first bb)]
         incr (second (first bb))]
    (if (empty? f)
      i
      (do
        (def nc (concat c [(first f)]))
        ;;(println "check list:" nc)
        (def ni (nextall nc i incr))
        (def ninc (* incr (second (first f))))        
        ;;(println "next:" ni)
        ;;(println "next incr:" ninc)
        (recur (rest f) ni nc ninc)
      )
    ))  
)
  
;;(println (solution2 input 0))
