(ns build
  (:require [nextjournal.clerk :as clerk]
            [clojure.java.shell :refer [sh]]))

(defn build! [opts]
  (println "Installing tailwind…")
  (sh "npm" "install" "-D" "tailwindcss" "@tailwindcss/typography")
  (println (:out (sh "npx" "tailwindcss" "--help")))
  (clerk/build! opts))
