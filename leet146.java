class LRUCache {

    
        public static class Node{
            int key;
            int value;
            Node prev;
            Node next;
            public Node(int key,int value){
                this.key=key;
                this.value=value;
            }

        }
        private final int capacity;
        private final HashMap<Integer,Node> map;
        private final Node head;
        private final Node tail;

        public LRUCache(int capacity) {
            this.capacity=capacity;
            map=new HashMap<>();
            head=new Node(0,0);
            tail=new Node(0,0);
            head.next=tail;
            tail.prev=head;
        }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;}
            else{
                Node node=map.get(key);
                remove(node);
                insertAthead(node);
                return node.value;
            }
        
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.value=value;
            remove(node);
            insertAthead(node);
        }else{
            if(map.size()==capacity){
               map.remove(tail.prev.key);
                remove(tail.prev);
            }
                Node newnode= new Node(key,value);
                map.put(key,newnode);
                insertAthead(newnode);
            
        }}
        private void remove(Node node){
            node.prev.next=node.next;
            node.next.prev=node.prev;
        }
        private void insertAthead(Node node){
            node.next=head.next;
            node.next.prev=node;
            head.next=node;
            node.prev=head;
        }

        
    }


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
