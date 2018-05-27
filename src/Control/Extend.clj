(ns Control.Extend._foreign)

(defn arrayExtend [f]
  (fn [xs]
    (vec (map-indexed
          (fn [i _]
            (f (vec (drop i xs))))
          xs))))
