package com.yisenjing.third10;

import com.yisenjing.third3.ListNode;

/**
 * Created by Yisen on 4/10/16.
 */
public class ReverseLinkedListInPairs {

    public ListNode reverseInPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null && cur.next.next != null) {
            ListNode next = cur.next.next;
            cur.next.next = cur.next.next.next;
            next.next = cur.next;
            cur.next = next;
            cur = cur.next.next;
        }
        return dummy.next;
    }


}
