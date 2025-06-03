class Solution {//Leetcode 147-->medium
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode temp=head;
        List<Integer>list=new ArrayList<>();
        while(temp!=null){
          list.add(temp.val);
          temp=temp.next;
        }
        Collections.sort(list);
        ListNode nh=new ListNode(-1);
        ListNode h=nh;
        for(int i=0;i<list.size();i++){
            ListNode curr=new ListNode(list.get(i));
            h.next=curr;
            h=h.next;
        }
        return nh.next;
    }
}
