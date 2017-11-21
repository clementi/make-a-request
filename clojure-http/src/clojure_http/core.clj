(ns clojure-http.core
  (:gen-class)
  (:require [clj-http.client :as client]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (:body (client/get "https://httpbin.org/anything")
                  {:headers {:accept :json}})))
