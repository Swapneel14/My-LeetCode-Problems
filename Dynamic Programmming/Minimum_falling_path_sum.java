class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][]dp = new int[n][n];

        for(int j=0;j<n;j++){
            dp[0][j]=matrix[0][j];
        }

        int ans = Integer.MAX_VALUE;

        for(int i =1;i<n;i++){
            for(int j=0;j<n;j++){
                int left = dp[i-1][Math.max(j-1,0)];
                int top = dp[i-1][j];
                int right = dp[i-1][Math.min(j+1,n-1)];

                dp[i][j]=matrix[i][j]+Math.min(left,Math.min(right,top));

                if(i==n-1)ans=Math.min(ans,dp[i][j]);
            }

            
        }

        if(n==1){
            ans=matrix[0][0];
        }

        return ans;
    }
}
