(ns user
  (:require [nextjournal.clerk :as clerk]))

(clerk/serve! {:port 7891})
(clerk/show! "index.clj")
