(ns
  ^{:author jinhock}
  clojuretutorial.view
  (:use hiccup.page hiccup.element))


(defn index-page [x]
  (html5 [:html
          [:head]
          [:body (str "Hello, " x)]]))