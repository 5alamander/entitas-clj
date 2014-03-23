(defproject entitas-clj "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [org.clojure/clojurescript "0.0-2173"]
                 [shodan "0.1.0"]]
  :profiles {:dev {:dependencies [[criterium "0.4.3"]]
                   :plugins [[com.keminglabs/cljx "0.3.2"]
                             [lein-cljsbuild "1.0.2"]
                             [lein-marginalia "0.7.1"]]}}
  :source-paths ["src/clj"]
  :cljx {:builds [{:source-paths ["src/cljx"]
                   :output-path "src/clj"
                   :rules :clj}
                  {:source-paths ["src/cljx"]
                   :output-path "src/cljs"
                   :rules :cljs}]}
  :cljsbuild {:builds [{:source-paths ["src/cljs"]
                        :compiler {:output-to "resources/public/js/main.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]}
  :jvm-opts ["-server"]
  :hooks [cljx.hooks]
  :main entitas-clj.performance)
