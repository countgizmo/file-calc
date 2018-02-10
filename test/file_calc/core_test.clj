(ns file-calc.core-test
  (:require [clojure.test :refer :all]
            [file-calc.core :refer :all]))

(def test-data-good
 ["ADD 5"
  "ADD 7"
  "SUB 9"
  "SQR"])

(deftest calculation-should-work
  (is (= 9 (calculate test-data-good))))
