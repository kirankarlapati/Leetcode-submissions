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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode first=head;
        ListNode sec=head.next;
        ListNode newhead=sec;
        while(sec!=null){
            ListNode np=sec.next;
            sec.next=first;
            first.next=np;
            if(np==null || np.next==null) break;
            first.next=np.next;
            first=np;
            sec=np.next;
        }
        return newhead;
    }
}