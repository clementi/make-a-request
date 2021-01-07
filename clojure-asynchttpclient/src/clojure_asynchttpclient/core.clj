(ns clojure-asynchttpclient.core
  (:import org.asynchttpclient.Dsl))

(defn -main []
  (let [fut (-> (Dsl/asyncHttpClient)
                (.prepareGet "http://httpbin.org/anything")
                (.addHeader "Accept" "application/json")
                (.execute))]
    (println (-> fut
                 (.get)
                 (.getResponseBody)))))
