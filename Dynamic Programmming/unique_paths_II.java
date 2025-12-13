class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]dp=new int[m][n];
        for(int i=0;i<n;i++){
            if(grid[0][i]==1)break;

            dp[0][i]=1;

        }
        for(int i=0;i<m;i++){
            if(grid[i][0]==1)break;
            dp[i][0]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(grid[i][j]==1){
                    dp[i][j]=-1;
                    continue;
                }
                int up=(dp[i-1][j]==-1)?0:dp[i-1][j];
                int left=(dp[i][j-1]==-1)?0:dp[i][j-1];
                dp[i][j]=up+left;
            }
        }
        if(dp[m-1][n-1]==-1)return 0;
        return dp[m-1][n-1];
    }
}
