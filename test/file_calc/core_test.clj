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

(deftest empty-input-zero-output
  (is (= 0 (calculate []))))

(deftest incorrect-input-zero-output
  (is (= 0 (calculate ["Of all the things"]))))
