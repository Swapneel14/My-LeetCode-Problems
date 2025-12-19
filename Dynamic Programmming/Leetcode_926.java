class Solution {
    public int minFlipsMonoIncr(String s) {
        int n=s.length();
        int[]dp=new int[n];
        dp[0]=0;
        int ones=0;
        if(s.charAt(0)=='1')ones++;
        for(int i=1;i<n;i++ ){
            char ch=s.charAt(i);
            if(ch=='1'){
                ones++;
                dp[i]=dp[i-1];
            }
            else{
                dp[i]=Math.min(dp[i-1]+1,ones);
            }
        }
        return dp[n-1];
    }
}
