class Solution {//Leetcode-->Easy
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        if(head==null||head.next==null)return head;
        while(temp!=null&&temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
                
                  }
                  else{
           
             temp=temp.next;
           }

        }
        return head;

    }
}
