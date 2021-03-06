(defproject entitas-clj "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.async "0.1.278.0-76b25b-alpha"]
                 [camel-snake-kebab "0.1.5"]]
  :profiles {:dev {:plugins [[com.keminglabs/cljx "0.3.2"]
                             [lein-marginalia "0.7.1"]]}}
  :source-paths ["src/clj"]
  :cljx {:builds [{:source-paths ["src/cljx"]
                   :output-path "target/classes"
                   :rules :clj}
                  {:source-paths ["src/cljx"]
                   :output-path "target/classes"
                   :rules :cljs}]}
  :cljsbuild {:builds [{:source-paths ["src/cljs"]
                        :compiler {:output-to "resources/public/js/main.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]}
  :hooks [cljx.hooks]
  :jvm-opts ["-server"]
  :main entitas-clj.performance)
