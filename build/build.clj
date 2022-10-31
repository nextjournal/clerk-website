(ns build
  (:require [nextjournal.clerk :as clerk]
            [clojure.java.shell :refer [sh]]))

(defn build! [opts]
  (println "Installing tailwind…")
  (assert (= 0 (:exit (sh "which" "npm"))) "Node need to be installed")
  (sh "npm" "install" "-D" "tailwindcss" "@tailwindcss/typography")
  #_ (sh "npx" "tailwindcss" "--help")
  (clerk/build! opts))
