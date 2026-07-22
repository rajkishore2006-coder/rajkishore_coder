/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 **/
 class Solution {

    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] ans = new ListNode[k];

        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int baseSize = length / k;
        int extra = length % k;

        temp = head;

        for (int i = 0; i < k; i++) {

            if (temp == null) {
                ans[i] = null;
                continue;
            }

            ans[i] = temp;

            int currentSize = baseSize;

            if (extra > 0) {
                currentSize++;
                extra--;
            }

            for (int j = 1; j < currentSize; j++) {
                temp = temp.next;
            }

            ListNode nextPart = temp.next;
            temp.next = null;
            temp = nextPart;
        }

        return ans;
    }
}


        

