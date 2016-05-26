package com.yisenjing.third3;

/**
 * Created by Yisen on 4/7/16.
 */
public class ReOrderLinkedList {

    public ListNode reorder(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode mid = findMid(head);
        ListNode one = head;
        ListNode two = mid.next;
        mid.next = null;
        return merge(one, reverse(two));
    }


    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head) {
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

    private ListNode merge(ListNode one, ListNode two) {

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (one != null && two != null) {
            cur.next = one;
            one = one.next;

            cur.next.next = two;
            two = two.next;
            cur = cur.next.next;
        }

        if (one != null) {
            cur.next = one;
        } else if (two != null) {
            cur.next = two;
        }
        return dummy.next;
    }





}
