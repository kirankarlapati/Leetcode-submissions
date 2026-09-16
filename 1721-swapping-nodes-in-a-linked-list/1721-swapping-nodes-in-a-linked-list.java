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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast=head;
        ListNode slow=head;
        for(int i=1;i<k;i++) {
            // if(i==k-1) continue;
            fast=fast.next;
        }
        ListNode temp=fast;
        fast=fast.next;
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        int t=temp.val;
        temp.val=slow.val;
        slow.val=t;
        return head;
    }
}