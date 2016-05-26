package com.yisenjing.third3;

/**
 * Created by Yisen on 4/7/16.
 */
public class MergeTwoSortedLinkedLists {

    public ListNode merge(ListNode one, ListNode two) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (one != null && two != null) {
            if (one.value < two.value) {
                cur.next = one;
                one = one.next;
            } else {
                cur.next = two;
                two = two.next;
            }
            cur = cur.next;
        }

        if (one != null) {
            cur.next = one;
        } else if (two != null) {
            cur.next = two;
        }

        return dummy.next;
    }


}
