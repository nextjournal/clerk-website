(ns build
  (:require [nextjournal.clerk :as clerk]
            [clojure.java.shell :refer [sh]]))

(defn build! [opts]
  (assert (= 0 (:exit (sh "which" "npm"))) "Node needs to be installed")
  (assert (= 0 (:exit (sh "which" "npx"))) "`npx` needs to be available")
  (println "Installing tailwind…")
  (sh "npm" "install" "-D" "tailwindcss" "@tailwindcss/typography")
  #_ (sh "npx" "tailwindcss" "--help")
  (clerk/build! opts))
