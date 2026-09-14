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
    public boolean hasCycle(ListNode head) {
       HashSet<ListNode> set=new HashSet<>();
       while(head!=null){
        ListNode val=head;
        head=head.next;
        if(set.contains(val)){
            return true;
        }
        set.add(val);
       }
       return false;
    }
}
