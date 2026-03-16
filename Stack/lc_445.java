/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode>st1=new Stack<>();
        Stack<ListNode>st2=new Stack<>();

        while(l1!=null){
            st1.push(l1);
            l1=l1.next;
        }
        while(l2!=null){
            st2.push(l2);
            l2=l2.next;
        }
        Stack<ListNode>ans = new Stack<>();
        int carry=0;
        while((!st1.isEmpty())||(!st2.isEmpty())){
            int val1=(st1.isEmpty()?0:st1.pop().val);
            int val2=(st2.isEmpty()?0:st2.pop().val);
           int  sum=val1+val2+carry;
            ListNode dig = new ListNode(sum%10);
            ans.push(dig);
            carry=sum/10;
        }
        if(carry!=0)ans.push(new ListNode(1));

        ListNode dummy = new ListNode(-1);
        ListNode head=dummy;
        while(!ans.isEmpty()){
           dummy.next=ans.pop();
           dummy=dummy.next;
        }

        return head.next;
        
    }
}
