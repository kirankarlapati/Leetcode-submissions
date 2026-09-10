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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dum=new ListNode(0);
        ListNode curr=dum;
        int temp=0;
        while(l1!=null || l2!=null || temp!=0){
            int x=(l1!=null) ? l1.val:0;
            int y=(l2!=null) ? l2.val:0;
            int sum=x+y+temp;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            temp=sum/10;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return dum.next;
    }
}