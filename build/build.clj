(ns build
  (:require [nextjournal.clerk :as clerk]
            [clojure.java.shell :refer [sh]]))

(defn build! [opts]
  (sh "npm" "install" "-D" "tailwindcss" "@tailwindcss/typography")
  #_ (sh "npx" "tailwindcss" "--help")
  (clerk/build! opts))
