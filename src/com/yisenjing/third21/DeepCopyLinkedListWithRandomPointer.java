package com.yisenjing.third21;

/**
 * Created by Yisen on 4/14/16.
 */
public class DeepCopyLinkedListWithRandomPointer {

    public RandomListNode copy(RandomListNode head) {



        if (head == null) {
            return head;
        }


        RandomListNode cur = head;

        while (cur != null) {
            RandomListNode next = cur.next;
            cur.next = new RandomListNode(cur.value);
            cur.next.next = next;
            cur = next;
        }

        cur = head;

        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        cur = head;

        RandomListNode dummy = new RandomListNode(0);

        RandomListNode copyPrev = dummy;



        while (cur != null) {
            copyPrev.next = cur.next;
            cur.next = cur.next.next;
            copyPrev = copyPrev.next;
            cur = cur.next;
        }
        return dummy.next;
    }



}
