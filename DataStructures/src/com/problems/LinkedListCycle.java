package com.problems;

public class LinkedListCycle {

    public static void main(String args) {

    }

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return true;
            }
            slow = head.next;
            fast = head.next.next;
        }

        return true;
    }

}
