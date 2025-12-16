class Solution {//Leetcode-1611 Hard
    public int minimumOneBitOperations(int n) {
        int[]dp=new int[32];
        dp[0]=1;
        for(int i=1;i<32;i++){
            dp[i]=2*dp[i-1]+1;
        }
        int sign=1;
        int res=0;
        for(int i=31;i>=0;i--){
            int t=1<<i;
            int bit=n&t;
            if(bit==0)continue;

            if(sign>0){
                res+=dp[i];
            }
            else{
                res-=dp[i];
            }
            sign*=-1;
        }
        return res;
    }
}
