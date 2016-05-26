package com.yisenjing.third3;


/**
 * Created by Yisen on 4/6/16.
 */
public class ReverseLinkedList {

    public ListNode reverse(ListNode head) {

        if (head == null) {
            return head;
        }


        ListNode prev = null;

        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }



}
