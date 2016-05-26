package com.yisenjing.third25;

import java.util.*;

/**
 * Created by Yisen on 4/23/16.
 */
public class PlaceToPutTheChairI {

    private final char EQUI = 'E';
    private final char OBS = 'O';

    public List<Integer> putChair(char[][] gym) {


        int m = gym.length;
        int n = gym[0].length;

        int[][] cost = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (gym[i][j] == EQUI) {
                    if (!addCost(i, j, cost, gym)) {
                        return null;
                    }
                }
            }
        }


        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (gym[i][j] != EQUI && gym[i][j] != OBS) {
                    if (result == null) {
                        result = Arrays.asList(i, j);
                    } else {
                        if (cost[result.get(0)][result.get(1)] > cost[i][j]) {
                            result.set(0, i);
                            result.set(1, j);
                        }
                    }
                }

            }
        }
        return result;
    }


    private boolean addCost(int i, int j, int[][] cost, char[][] gym) {

        Deque<Pair> stack = new LinkedList<>();

        boolean[][] visited = new boolean[cost.length][cost[0].length];

        stack.offerLast(new Pair(i, j));

        visited[i][j] = true;

        int totalCost = 1;

        while (!stack.isEmpty()) {
            int size = stack.size();

            for (int p = 0; p < size; p++) {
                Pair cur = stack.pollFirst();
                List<Pair> neis = getNei(cur.i, cur.j, gym);

                for (Pair nei : neis) {
                    if (!visited[nei.i][nei.j]) {
                        stack.offerLast(nei);
                        visited[nei.i][nei.j] = true;
                        cost[nei.i][nei.j] += totalCost;
                    }
                }

            }
            totalCost++;
        }


        for (int x = 0; x < gym.length; x++) {
            for (int y = 0; y < gym[0].length; y++) {
                if (gym[x][y] == EQUI && !visited[x][y]) {
                    return false;
                }
            }
        }

        return true;
    }


    private List<Pair> getNei(int i, int j, char[][] gym) {

        List<Pair> result = new ArrayList<>();

        if (i - 1 >= 0 && gym[i - 1][j] != OBS) {
            result.add(new Pair(i - 1, j));
        }

        if (i + 1 < gym.length && gym[i + 1][j] != OBS) {
            result.add(new Pair(i + 1, j));
        }

        if (j - 1 >= 0 && gym[i][j - 1] != OBS) {
            result.add(new Pair(i, j - 1));
        }

        if (j + 1 < gym[0].length && gym[i][j + 1] != OBS) {
            result.add(new Pair(i, j + 1));
        }
        return result;
    }


    private class Pair {
        public int i;
        public int j;
        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }


}
