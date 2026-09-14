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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = head;
        int count = 0;
        ListNode ans = new ListNode(0);
        ListNode finalans = ans;
        while (head != null) {
            count++;
            head = head.next;
        }
        System.out.println(count);
        head = dummy;
        int i = 0;

        while (i < count) {
            if (i == count - n) {
                head = head.next;
                i++;
            } else {
                ans.next = head;
                head = head.next;
                ans = ans.next;
                i++;
            }
        }
        ans.next = null;
        // System.out.println(count++);
        return finalans.next;
    }
}
