class Solution {
    long[]dp;

    private long solve(int ind,int[][]arr){
        if(ind>=arr.length)return 0;
        if(dp[ind]!=-1)return dp[ind];

        long take = arr[ind][0] + solve(ind+1+arr[ind][1],arr);
        long skip = solve(ind+1,arr);

        return dp[ind] = Math.max(take,skip);
    }
    public long mostPoints(int[][] arr) {
        int n = arr.length;
        dp = new long[n];

        Arrays.fill(dp,-1);

        return solve(0,arr);

    }
}
