(ns async-test.core
  (:require [clojure.core.async :refer [chan go <! >! close! <!!]]
            [clj-http.client :as client]))

(defn fire []
  (let [c (chan)]
    (go (>! c (client/get "http://j0ni.ca"))
        (close! c))
    (println (<!! c ))))

(defn -main [& args]
  (fire))
