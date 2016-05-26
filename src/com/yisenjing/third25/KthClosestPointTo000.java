package com.yisenjing.third25;

import java.util.*;

/**
 * Created by Yisen on 4/21/16.
 */
public class KthClosestPointTo000 {


    public List<Integer> closest(int[] a, int[] b, int[] c, int k) {

        PriorityQueue<List<Integer>> minHeap = new PriorityQueue<List<Integer>>(k, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {

                long a1 = distance(o1, a, b, c);
                long a2 = distance(o2, a, b, c);

                if (a1 == a2) {
                    return 0;
                }
                return a1 < a2 ? -1 : 1;
            }
        });

        List<Integer> cur = Arrays.asList(0, 0, 0);

        minHeap.offer(cur);

        HashSet<List<Integer>> set = new HashSet<>();

        set.add(cur);

        while (k >= 1) {

            cur = minHeap.poll();

            List<Integer> n = Arrays.asList(cur.get(0) + 1, cur.get(1), cur.get(2));

            if (n.get(0) < a.length && set.add(n)) {
                minHeap.offer(n);
            }

            n = Arrays.asList(cur.get(0), cur.get(1) + 1, cur.get(2));

            if (n.get(1) < b.length && set.add(n)) {
                minHeap.offer(n);
            }

            n = Arrays.asList(cur.get(0), cur.get(1), cur.get(2) + 1);
            if (n.get(2) < c.length && set.add(n)) {
                minHeap.offer(n);
            }
            k--;
        }

        cur.set(0, a[cur.get(0)]);
        cur.set(1, b[cur.get(1)]);
        cur.set(2, c[cur.get(2)]);
        return cur;

    }


    private long distance(List<Integer> cood, int[] a, int[] b, int[] c) {

        long distance = 0;
        distance += a[cood.get(0)] * a[cood.get(0)];
        distance += b[cood.get(1)] * b[cood.get(1)];
        distance += c[cood.get(2)] * c[cood.get(2)];
        return distance;
    }






}
