class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null)return head;
       ListNode dummy =new ListNode(0);
       ListNode curr=head;
       ListNode pre=dummy;
       dummy.next=head;
       for(int i=0;i<left-1;i++){
        pre=pre.next;
        curr=curr.next;
       }
       ListNode choto=curr;
       ListNode prev=null;
       for(int i=0;i<=right-left;i++){
         ListNode nextu= curr.next;
         curr.next=prev;
         prev=curr;
         curr=nextu;
       }
       pre.next=prev;
       choto.next=curr;
       return dummy.next;
        
    }
}
