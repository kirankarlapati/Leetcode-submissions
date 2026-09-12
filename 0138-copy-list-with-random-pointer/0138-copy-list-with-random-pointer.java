/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        HashMap<Node,Node> hm=new HashMap<>();
        Node x=head;
        while(x!=null){
            hm.put(x,new Node(x.val));
            x=x.next;
        }
        x=head;
        while(x!=null){
            Node y=hm.get(x);
            y.next=hm.get(x.next);
            y.random=hm.get(x.random);
            x=x.next;
        }
        return hm.get(head);
    }
}