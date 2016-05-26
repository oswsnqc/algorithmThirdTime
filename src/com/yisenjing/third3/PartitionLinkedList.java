package com.yisenjing.third3;

/**
 * Created by Yisen on 4/7/16.
 */
public class PartitionLinkedList {

    public ListNode partition(ListNode head, int target) {
        if (head == null) {
            return head;
        }


        ListNode dummySmall = new ListNode(0);
        ListNode dummyLarge = new ListNode(0);
        ListNode curSmall = dummySmall;
        ListNode curLarge = dummyLarge;

        while (head != null) {
            if (head.value < target) {
                curSmall.next = head;
                curSmall = curSmall.next;
            } else {
                curLarge.next = head;
                curLarge = curLarge.next;
            }
            head = head.next;
        }

        curSmall.next = dummyLarge.next;
        curLarge.next = null;
        return dummySmall.next;
    }


}
