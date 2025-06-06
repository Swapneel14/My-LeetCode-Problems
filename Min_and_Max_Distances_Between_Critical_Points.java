class Solution {//Leetcode Medium-->2058
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first=0;
        int c1=0;
        int c2=0;
        boolean lastisc1=false;
        ListNode prev=head;
        int[]ans={-1,-1};
        int mindis=Integer.MAX_VALUE;
       
        ListNode curr=head.next;
        int curridx=1;
        while(curr!=null&&curr.next!=null){
            if(curr.val>prev.val&&curr.val>curr.next.val){ //Maxima
                   if(lastisc1){
                    c2=curridx;
                   }
                   else{
                    c1=curridx;
                    
                   } 
                   lastisc1=!lastisc1;
                
                if(first==0)first=curridx;
            }                                       
            
            else if(curr.val<prev.val&&curr.val<curr.next.val){//Minima
               if(lastisc1){
                    c2=curridx;
                   }
                   else{
                    c1=curridx;
                   
                   } 
                   lastisc1=!lastisc1;
               if(first==0)first=curridx;
            }
            if(c1!=0&&c2!=0){
                int dis=Math.abs(c2-c1);
                mindis=Math.min(mindis,dis);
                ans[0]=mindis;
            }
            curr=curr.next;
            prev=prev.next;
            curridx++;

        }
       if(c1!=0&&c2!=0){
         int dis1=Math.abs(c1-first);
        int dis2=Math.abs(c2-first);
       int maxdis=Math.max(dis1,dis2);
       if(maxdis>0)ans[1]=maxdis;
       }
       
        return ans;
        
    }
}
