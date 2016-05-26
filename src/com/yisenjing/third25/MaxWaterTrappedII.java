package com.yisenjing.third25;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by Yisen on 4/24/16.
 */
public class MaxWaterTrappedII {

    public int maxTrapped(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        PriorityQueue<Pair> minHeap = new PriorityQueue<Pair>();
        int result = 0;

        if (m < 3 || n < 3) {
            return result;
        }

        processBoarder(minHeap, matrix, visited);
        while (!minHeap.isEmpty()) {
            Pair cur = minHeap.poll();
            List<Pair> neis = getNeis(cur, matrix);

            for (Pair nei : neis) {
                if (!visited[nei.i][nei.j]) {
                    result += Math.max(0, cur.height - nei.height);
                    nei.height = Math.max(nei.height, cur.height);
                    visited[nei.i][nei.j] = true;
                    minHeap.add(nei);
                }
            }
        }
        return result;
    }


    private void processBoarder(PriorityQueue minHeap, int[][] matrix, boolean[][] visited) {

        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            minHeap.offer(new Pair(i, 0, matrix[i][0]));
            minHeap.offer(new Pair(i, n - 1, matrix[i][n - 1]));
            visited[i][0] = true;
            visited[i][n - 1] = true;
        }
        for (int i = 1; i < n - 1; i++) {
            minHeap.offer(new Pair(0, i, matrix[0][i]));
            minHeap.offer(new Pair(m - 1, i, matrix[m - 1][i]));
            visited[0][i] = true;
            visited[m - 1][i] = true;
        }
    }


    private List<Pair> getNeis(Pair cur, int[][] matrix) {
        List<Pair> result = new ArrayList<>();
        int i = cur.i;
        int j = cur.j;
        if (i + 1 < matrix.length) {
            result.add(new Pair(i + 1, j, matrix[i + 1][j]));
        }

        if (j + 1 < matrix[0].length) {
            result.add(new Pair(i, j + 1, matrix[i][j + 1]));
        }

        if (i - 1 >= 0) {
            result.add(new Pair(i - 1, j, matrix[i - 1][j]));
        }

        if (j - 1 >= 0) {
            result.add(new Pair(i, j - 1, matrix[i][j - 1]));
        }
        return result;
    }



    static class Pair implements Comparable<Pair> {
        public int i;
        public int j;
        public int height;
        public Pair(int i, int j, int height) {
            this.i = i;
            this.j = j;
            this.height = height;
        }
        @Override
        public int compareTo(Pair another) {
            if (this.height == another.height) {
                return 0;
            }
            return this.height < another.height ? -1 : 1;
        }
    }


}
