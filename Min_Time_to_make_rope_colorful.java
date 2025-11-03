class Solution {
    public class Pair{
        char ch;
        int time;
        Pair(char c,int time){
            this.ch=c;
            this.time=time;
        }
    }
    public int minCost(String colors, int[] time) {
        int n=colors.length();
        Stack<Pair>st=new Stack<>();
        int ans=0;
        for(int i=0;i<n;i++){
            if(!st.isEmpty()&&(st.peek().ch==colors.charAt(i))){
               ans+=Math.min(time[i],st.peek().time);
               if(time[i]>st.peek().time){
                  st.pop();
               }
               else{
                continue;
               }
            }
            st.push(new Pair(colors.charAt(i),time[i]));
        }
        return ans;
        
    }
}
