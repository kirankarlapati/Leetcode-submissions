/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
};
*/

class Solution {
    public int[] toArray(Node head) {
        int size=0,i=0;
        Node curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        int[] a=new int[size];
        curr=head;
        while(curr!=null){
            a[i++]=curr.val;
            curr=curr.next;
        }
        return a;
    }
}