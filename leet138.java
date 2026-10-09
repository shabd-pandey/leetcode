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
    HashMap<Node,Node> vistednode=new HashMap<>();
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        if(this.vistednode.containsKey(head)){
            return this.vistednode.get(head);
        }
        Node node = new Node(head.val,null,null);
        this.vistednode.put(head,node);
        node.next=copyRandomList(head.next);
         node.random=copyRandomList(head.random);
        return node;
    }
}
