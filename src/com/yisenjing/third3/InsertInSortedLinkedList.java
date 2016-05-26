package com.yisenjing.third3;

/**
 * Created by Yisen on 4/7/16.
 */
public class InsertInSortedLinkedList {

    public ListNode insert(ListNode head, int value) {
        ListNode newHead = new ListNode(value);

        if (head == null || head.value > value) {
            newHead.next = head;
            return newHead;
        }


        ListNode prev = head;

        while (prev.next != null && prev.next.value < value) {
            prev = prev.next;
        }

        ListNode temp = prev.next;
        prev.next = newHead;
        newHead.next = temp;
        return head;
    }


}
