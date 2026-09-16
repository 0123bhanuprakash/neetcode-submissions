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
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reverse = slow.next;
        slow.next = null;
        ListNode reversed = reverse(reverse);
        slow = head;

        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        while (slow != null ||  reversed != null) {
            if (slow != null) {
                ans.next = slow;
                slow = slow.next;
                ans = ans.next;
            }

            if (reversed != null) {
                ans.next = reversed; 
                reversed = reversed.next; 
                ans = ans.next;
            }
        }
    }
}
