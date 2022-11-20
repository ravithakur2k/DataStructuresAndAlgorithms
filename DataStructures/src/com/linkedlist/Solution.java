package com.linkedlist;

public class Solution {

    public static void main(String args[]) {
        ListNode nodeA = new ListNode(4);
        nodeA.next = new ListNode(1);
        nodeA.next.next = new ListNode(8);
        nodeA.next.next.next = new ListNode(4);
        nodeA.next.next.next.next = new ListNode(5);

        ListNode nodeB = new ListNode(5);
        nodeB.next = new ListNode(6);
        nodeB.next.next = new ListNode(1);
        nodeB.next.next.next = new ListNode(8);
        nodeB.next.next.next.next = new ListNode(4);
        nodeB.next.next.next.next.next = new ListNode(5);

        getIntersectionNodeElegantSoln(nodeA, nodeB);

    }

    public static ListNode getIntersectionNodeElegantSoln(ListNode headA, ListNode headB) {
        ListNode ptrA = headA, ptrB = headB;
        while (ptrA != ptrB) { // loop until we found the first common node
            ptrA = ptrA == null ? headB : ptrA.next; // once we're done with A, move to B
            ptrB = ptrB == null ? headA : ptrB.next; // once we're done with B, move to A
        }
        return ptrA;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int headALength =  findLength(headA);
        int headBLength =  findLength(headB);
        int difference = 0;
        if (headALength > headBLength) {
            difference = headALength - headBLength;
            while (difference > 0) {
                headA = headA.next;
                difference--;
            }
        } else {
            difference = headBLength - headALength;
            while (difference > 0) {
                headB = headB.next;
                difference--;
            }
        }
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;

    }

    private static int findLength(ListNode node){
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }

}
