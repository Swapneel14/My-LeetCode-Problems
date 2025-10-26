class Solution {
    public int numTrees(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int val=2;val<=n;val++){
            int total=0;
            for(int i=1;i<=val;i++){
                int left=i-1;
                int right=val-i;
                total+=dp[left]*dp[right];
            }
            dp[val]=total;
        }
        return dp[n];
    }
}
