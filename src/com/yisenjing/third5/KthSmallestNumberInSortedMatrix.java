package com.yisenjing.third5;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Yisen on 4/8/16.
 */
public class KthSmallestNumberInSortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {

        int xLength = matrix[0].length;
        int yLength = matrix.length;


        PriorityQueue<Point> minHeap = new PriorityQueue<Point>(k, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.value == o2.value) {
                    return 0;
                }
                return o1.value < o2.value ? -1 : 1;
            }
        });


        boolean[][] visited = new boolean[yLength][xLength];

        minHeap.offer(new Point(0, 0, matrix[0][0]));
        visited[0][0] = true;
        int result = matrix[0][0];
        for (int i = 1; i < k; i++) {
            Point cur = minHeap.poll();

            if (cur.x + 1 < xLength && !visited[cur.y][cur.x + 1]) {
                minHeap.offer(new Point(cur.x + 1, cur.y, matrix[cur.y][cur.x + 1]));
                visited[cur.y][cur.x + 1] = true;
            }

            if (cur.y + 1 < yLength && !visited[cur.y + 1][cur.x]) {
                minHeap.offer(new Point(cur.x, cur.y + 1, matrix[cur.y + 1][cur.x]));
                visited[cur.y + 1][cur.x] = true;
            }

            result = minHeap.peek().value;
        }
        return result;
    }


    class Point {
        public int x;
        public int y;
        public int value;
        public Point(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }

}
