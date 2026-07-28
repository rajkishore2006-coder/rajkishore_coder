/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        // Find length and last node
        int length = 1;
        ListNode last = head;

        while (last.next != null) {
            last = last.next;
            length++;
        }

        // Reduce unnecessary rotations
        k = k % length;

        if (k == 0) {
            return head;
        }

        // Make the list circular
        last.next = head;

        // Find the new last node
        ListNode newLast = head;

        for (int i = 1; i < length - k; i++) {
            newLast = newLast.next;
        }

        // New head
        ListNode newHead = newLast.next;

        // Break the circle
        newLast.next = null;

        return newHead;
    }
}

        
    
