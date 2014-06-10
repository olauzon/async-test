(defproject async-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 ;; [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [capacitor "0.2.2"]
                 [org.clojure/core.async "0.1.303.0-886421-alpha"]]
  :aot :all
  :main async-test.core)
