(defproject file-calc "0.1.0"
  :description "Test assignment for Zimpler"
  :source-paths ["src"]
  :test-paths ["test"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [proto-repl "0.3.1"]]
  :profiles
  {:uberjar
   {:aot :all
    :main file-calc.core
    :omit-source true}})
