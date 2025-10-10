public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        if(head.next==head)return true;
        HashMap<ListNode,Integer>map=new HashMap<>();
        int pos=0;
        ListNode curr=head;
        while(curr!=null){
            if(!map.isEmpty()&&map.containsKey(curr))return true;
            map.put(curr,pos);
            pos++;
            curr=curr.next;

        }
        return false;
    }
}
