package com.yisenjing.third6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yisen on 4/8/16.
 */
public class CombinationsOfCoins {
    public List<List<Integer>> combinations(int target, int[] coins) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        List<Integer> cur = new ArrayList<Integer>();
        DFS(result, cur, target, coins, 0);
        return result;
    }

    private void DFS(List<List<Integer>> result, List<Integer> cur, int target, int[] coins, int index) {

        if (index == coins.length - 1) {
            if (target % coins[index] == 0) {
                cur.add(target / coins[index]);
                result.add(new ArrayList<>(cur));
                cur.remove(cur.size() - 1);
                return;
            }
        }


        int max = target / coins[index];
        for (int i = 0; i <= max; i++) {
            cur.add(i);
            DFS(result, cur, target - i * coins[index], coins, index + 1);
            cur.remove(cur.size() - 1);
        }
    }
}
