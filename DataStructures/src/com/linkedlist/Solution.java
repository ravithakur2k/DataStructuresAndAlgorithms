package com.linkedlist;

import java.util.Stack;

public class Solution {

    public static void main(String args[]) {
        ListNode nodeA = new ListNode(4);
        nodeA.next = new ListNode(1);
        nodeA.next.next = new ListNode(8);
        nodeA.next.next.next = new ListNode(2);
        nodeA.next.next.next.next = new ListNode(4);

        ListNode nodeB = new ListNode(5);
        nodeB.next = new ListNode(6);
        nodeB.next.next = new ListNode(1);
        nodeB.next.next.next = new ListNode(8);
        nodeB.next.next.next.next = new ListNode(4);
        nodeB.next.next.next.next.next = new ListNode(5);

      /*  ListNode newNode = new ListNode(nodeA.val);
        ListNode newNodeTemp = newNode;
        ListNode temp = nodeA.next;
        while(temp != null){
            newNodeTemp.next = new ListNode(temp.val);
            temp = temp.next;
            newNodeTemp = newNodeTemp.next;
        }
        ListNode reverseList = reverseListIterative(nodeA);
        if(newNode.equals(reverseList)){
            System.out.println("Is palindrome");
        }*/

        boolean isPalindrome = isPalindromeOof1Space(nodeA);
    }

    public static boolean isPalindromeOof1Space(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverseListIterative(slow);
        fast = head;

        while(slow != null){
            if(slow.val!= fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    private static boolean isPalindrome(ListNode newNode, ListNode reverseList) {
        ListNode tempNode = newNode;
        while(tempNode != null){
            if(tempNode.val != reverseList.val){
                return false;
            }
            tempNode = tempNode.next;
            reverseList = reverseList.next;
        }
        return true;
    }

    public static ListNode reverseListIterative(ListNode head) {

        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;

    }

    public static ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode tempNode = head;
        while (tempNode != null) {
            stack.push(new ListNode(tempNode.val));
            tempNode = tempNode.next;
        }
        ListNode newHead = stack.pop();
        ListNode temp = newHead;
        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;

        }
        return newHead;
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
        int headALength = findLength(headA);
        int headBLength = findLength(headB);
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

    private static int findLength(ListNode node) {
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }

}
