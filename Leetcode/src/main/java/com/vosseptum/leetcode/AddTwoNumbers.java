package com.vosseptum.leetcode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(l1.val + l2.val);
        ListNode currentNode = result;
        if (result.val >= 10) {
            result.val = result.val % 10;
            if (l1.next != null) {
                l1.next.val += 1;
            }
            else if (l2.next != null) {
                l2.next.val += 1;
            }
            else {
                l1.next = new ListNode(1);
                l2.next = new ListNode(0);
            }
        }
        while (l1.next != null || l2.next != null) {
            if (l2.next == null) {
                l2.next = new ListNode();
            }
            if (l1.next == null) {
                l1.next = new ListNode();
            }
            currentNode.next = new ListNode(l1.next.val + l2.next.val);
            ListNode newNode = currentNode.next;
            if (newNode.val < 10) {
                l1 = l1.next;
                l2 = l2.next;
                currentNode = newNode;
            }
            else {
                newNode.val = newNode.val % 10;
                l1 = l1.next;
                l2 = l2.next;
                if (l1.next != null) {
                    l1.next.val += 1;
                }
                else if (l2.next != null) {
                    l2.next.val += 1;
                }
                else {
                    l1.next = new ListNode(1);
                    l2.next = new ListNode(0);
                }
                currentNode = newNode;
            }
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
