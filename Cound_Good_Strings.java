class Solution {
    int Zeros;
    int Ones;
    int L;
    int H;
  int[]dp;
   int MOD = 1_000_000_007;
    
    int  solve(int len){
        if(len>H)return 0;
        if(dp[len]!=-1)return dp[len];
        int ans = (len>=L)?1:0;
        ans=(ans+solve(len+Zeros))%MOD;
        ans=(ans+solve(len+Ones))%MOD;

        return dp[len]=ans;
    }

    public int countGoodStrings(int low, int high, int zero, int one) {
        L=low;
        H=high;
        Zeros=zero;
        Ones=one;
        dp = new int[high+1];
        Arrays.fill(dp,-1);
        return solve(0);
    }
}
