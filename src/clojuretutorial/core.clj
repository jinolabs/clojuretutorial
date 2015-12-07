(ns clojuretutorial.core
  (:use compojure.core
        ring.middleware.json
        ring.util.response)
  (:require [compojure.route :as  route]
            [clojuretutorial.view :as view]))


(defroutes my_routes
  (GET "/" [] (view/index-page "Jin"))
  (GET "/rest" [] (response {:email "jinhock@gmail.com" }))
  (route/resources "/"))

(def app (wrap-json-response my_routes))