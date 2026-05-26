class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[]delrow = new int[]{0,1,0,-1};
        int[]delcol = new int[]{1,0,-1,0};

        int m = mat.length;
        int n = mat[0].length;

        int[][]visited = new int[m][n];
        int[][]ans = new int[m][n];

        Queue<int[]>q = new LinkedList<>();

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j,0});
                    visited[i][j]=1;
                }
            }
        }

        while(!q.isEmpty()){
            int[]pairs = q.poll();
            int row = pairs[0];
            int col = pairs[1];
            int dist = pairs[2];
            ans[row][col]=dist;

            for(int i = 0 ; i < 4 ; i++){
                int nrow = delrow[i]+row;
                int ncol = delcol[i]+col;

                if(nrow>=0&&nrow<m&&ncol>=0&&ncol<n&&visited[nrow][ncol]==0){
                    visited[nrow][ncol]=1;
                    q.offer(new int[]{nrow,ncol,dist+1});
                }
            }
        }

        return ans;
    }
}
