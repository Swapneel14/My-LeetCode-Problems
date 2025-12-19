class Solution {
    int[]dp=new int[10001];
    int helper(int n){
        if(n==0)return 0;
        if(dp[n]!=-1)return dp[n];

        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            min=Math.min(min,1+helper(n-i*i));
        }
        return dp[n]=min;
    }
    public int numSquares(int n) {
        Arrays.fill(dp,-1);
        return helper(n);
        
    }
}
