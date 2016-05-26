package com.yisenjing.third27;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Yisen on 4/25/16.
 */
public class LargestSetOfPointsWithPositiveSlope {

    class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int largest(Point[] points) {
        Arrays.sort(points, new compare());
        int result = 0;
        int[] largest = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < i; j++) {
                if (points[i].y > points[j].y && points[i].x > points[j].x) {
                    largest[i] = Math.max(largest[i], largest[j]);
                }
            }
            largest[i]++;
            result = Math.max(result, largest[i]);
        }
        return result == 1 ? 0 : result;
    }

    private class compare implements Comparator<Point> {
        @Override
        public int compare(Point p1, Point p2) {
            if (p1.y < p2.y) {
                return -1;
            } else if (p1.y > p2.y) {
                return 1;
            } else if (p1.x < p2.x) {
                return -1;
            } else if (p1.x > p2.x) {
                return 1;
            }
            return 0;
        }
    }


}
