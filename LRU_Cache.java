class Node{
    int key;
    int val;
    Node prev;
    Node nxt;
    public Node(int key,int val){
        this.key=key;
        this.val=val;
        this.prev=null;
        this.nxt=null;
    }
}
class LRUCache {
    private int cap;
    private HashMap<Integer,Node>map=new HashMap<>();
    private Node oldest;
    private Node latest;

    public LRUCache(int capacity) {
        this.cap=capacity;
        this.oldest=new Node(-1,-1);
        this.latest=new Node(-1,-1);
        this.oldest.nxt=this.latest;
        this.latest.prev=this.oldest;

    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node ans=map.get(key);
            int val=ans.val;
            remove(ans);
            insert(ans);
            return val;
        }
        return -1;
    }
    private void remove(Node t){
       t.prev.nxt=t.nxt;
       t.nxt.prev=t.prev;
    }
    private void insert(Node t){
        Node prev=latest.prev;
        Node nxt=latest;
        t.nxt=nxt;
        prev.nxt=nxt.prev=t;
        t.prev=prev;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        Node n=new Node(key,value);
        insert(n);
        map.put(key,n);
        if(map.size()>cap){
            Node lru=oldest.nxt;
            remove(lru);
            map.remove(lru.key);
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
