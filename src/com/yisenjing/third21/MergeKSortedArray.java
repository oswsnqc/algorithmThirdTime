package com.yisenjing.third21;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Yisen on 4/14/16.
 */
public class MergeKSortedArray {

    private class Point {
        public int vertical;
        public int horizental;
        public int value;
        public Point(int vertical, int horizental, int value) {
            this.vertical = vertical;
            this.horizental = horizental;
            this.value = value;
        }
    }

    public int[] merge(int[][] arrayOfArrays) {
        if (arrayOfArrays.length == 0) {
            return new int[]{};
        }
        PriorityQueue<Point> minHeap = new PriorityQueue<Point>(arrayOfArrays.length, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.value == o2.value) {
                    return 0;
                }
                return o1.value < o2.value ? -1 : 1;
            }
        });

        int length = 0;
        for (int i = 0; i < arrayOfArrays.length; i++) {
            if (arrayOfArrays[i].length != 0) {
                length += arrayOfArrays[i].length;
                minHeap.add(new Point(i, 0, arrayOfArrays[i][0]));
            }
        }
        int[] result = new int[length];
        int count = 0;
        while (!minHeap.isEmpty()) {
            Point cur = minHeap.poll();
            result[count++] = cur.value;
            if (cur.horizental + 1 < arrayOfArrays[cur.vertical].length) {
                minHeap.offer(new Point(cur.vertical, cur.horizental + 1, arrayOfArrays[cur.vertical][cur.horizental + 1]));
            }
        }
        return result;
    }


}
