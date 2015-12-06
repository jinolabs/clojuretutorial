(ns clojuretutorial.core
  (:use compojure.core)
  (:require [compojure.route :as  route]))

(defn foo [x]
  (str "Hello, " x))


(defroutes my_routes
  (GET "/" [] (foo "Jin"))
  (route/resources "/"))