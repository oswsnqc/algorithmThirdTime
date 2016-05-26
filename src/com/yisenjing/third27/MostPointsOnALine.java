package com.yisenjing.third27;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yisen on 4/25/16.
 */
public class MostPointsOnALine {

    class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int most(Point[] points) {
        int result = 0;
        for (int i = 0; i < points.length; i++) {
            Point seed = points[i];
            int same = 1;
            int samex = 0;
            int max = 0;
            Map<Double, Integer> map = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) {
                Point cur = points[j];
                if (seed.x == cur.x && seed.y == cur.y) {
                    same++;
                } else if (seed.x == cur.x) {
                    samex++;
                } else {
                    double slope = (seed.y - cur.y + 0.0) / (seed.x - cur.x);

                    if (map.containsKey(slope)) {
                        map.put(slope, map.get(slope) + 1);
                    } else {
                        map.put(slope, 1);
                    }
                    max = Math.max(max, map.get(slope));
                }
            }
            max = Math.max(max, samex) + same;
            result = Math.max(result, max);
        }
        return result;
    }


}
