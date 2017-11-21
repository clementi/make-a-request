(ns clojure-http.core
  (:gen-class)
  (:require [clj-http.client :as client]))

(defn -main
  [& args]
  (println (:body (client/get "https://httpbin.org/anything")
                  {:accept :json})))
