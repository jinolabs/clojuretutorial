(ns clojuretutorial.core
  (:use compojure.core)
  (:require [compojure.route :as  route]
            [clojuretutorial.view :as view]))

(defn foo [x]
  (view/index-page x))


(defroutes my_routes
  (GET "/" [] (foo "Jin"))
  (route/resources "/"))