//Time Complexity	O(n log n)
//Space Complexity	O(n)

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        TreeMap<Integer,Integer>map=new TreeMap<>();

        while(head!=null){
            map.put(head.val,map.getOrDefault(head.val,0)+1);
            head=head.next;
        }
        ListNode dummy=new ListNode(-1);
        ListNode ans= dummy;
        for(int val:map.keySet()){
           if(map.get(val)==1){
            ListNode x=new ListNode(val);
            ans.next=x;
            ans=ans.next;
           }
        }
        return dummy.next;
    }
}
