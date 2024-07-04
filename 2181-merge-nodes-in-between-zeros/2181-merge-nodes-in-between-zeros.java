/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode current = head.next;
        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        int sum = 0;
        while (current != null) {
            if (current.val == 0) {
                cur.next = new ListNode(sum);
                cur = cur.next;
                sum = 0;
            }

            sum += current.val;
            current = current.next;
        }

        return dummy.next;

    }
}