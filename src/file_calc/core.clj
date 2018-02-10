(ns file-calc.core
  (:require [clojure.string :as str]))

(def operations-fns
  {"ADD" +
   "SUB" -
   "MUL" *
   "DIV" /
   "SQR" (partial #(Math/round (Math/pow % 2)))})

(defn str->op-arg
 [s]
 (str/split s #" " 2))

(defn noop [n] n)

(defn op-arg->fn
 [[op-str arg-str]]
 (if-let [f (get operations-fns op-str)]
   (if (= "SQR" op-str) f
     (partial f (Integer. arg-str)))
   noop))

(def str->fn (comp op-arg->fn str->op-arg))

(defn calculate
 [coll]
 (->> (map str->fn coll)
      (reduce (fn [res op] (op res)) 0)))
