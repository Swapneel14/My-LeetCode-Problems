class Solution {
    int[][]ans;
    int delrow[] = {0,1,0,-1};
    int delcol[] = {1,0,-1,0};
    boolean visited[];
    int c;
    int init;
    void dfs(int row,int col,int[][]image){
        int n = image.length;
        int m = image[0].length;

        ans[row][col]=c;

        for(int i = 0 ;i<4;i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if(nrow<n&&ncol<m&&nrow>=0&&ncol>=0&&ans[nrow][ncol]==init){
                dfs(nrow,ncol,image);
            }
        }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        c=color;
        ans = image;
        init = image[sr][sc];
        if(init == c) return image;
        dfs(sr,sc,image);
        return ans;
    }
}
