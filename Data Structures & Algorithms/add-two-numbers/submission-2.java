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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        int carry=0;
        while(list1!=null && list2!=null){
            int a=list1.val;
            int b=list2.val;
            int sum=a+b+carry;
            carry=sum/10;
            ans.next=new ListNode(sum%10);
            list1=list1.next;
            list2=list2.next;
            ans=ans.next;
        }
        while(list1!=null){
            int sum=list1.val+carry;
            ans.next=new ListNode(sum%10);
            carry=sum/10;
            list1=list1.next;
            ans=ans.next;
        }
        while(list2!=null){
            int sum=list2.val+carry;
            ans.next=new ListNode(sum%10);
            carry=sum/10;
            list2=list2.next;
            ans=ans.next;
        }
        if(carry>=1){
            ans.next=new ListNode(carry);
        }
        return dummy.next;
    }
}
