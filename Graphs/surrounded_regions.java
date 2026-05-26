class Solution {
    int[]delrow = new int[]{0,1,0,-1};
    int[]delcol = new int[]{1,0,-1,0};
    int[][]per;

    void dfs(char[][]board,int row,int col){
        int m = board.length;
        int n = board[0].length;
        per[row][col]=1;

        for(int i = 0 ; i < 4 ; i++){
            int nrow = row+delrow[i];
            int ncol = col+delcol[i];

            if(nrow>=0&&nrow<m&&ncol>=0&&ncol<n&&board[nrow][ncol]=='O'&&per[nrow][ncol]!=1){
                dfs(board,nrow,ncol);
            }
        }
    }

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        per = new int[m][n];

        for(int i = 0 ; i < m ; i++){
           for(int j = 0 ; j < n ; j++){
            if((i==0||j==0||i==m-1||j==n-1)&&board[i][j]=='O'&&per[i][j]==0){
               dfs(board,i,j);
            }
           }
        }

        for(int i = 0 ; i < m ; i++){
           for(int j = 0 ; j < n ; j++){
            if(board[i][j]=='O'&&per[i][j]==0){
               board[i][j]='X';
            }
           }
        }



    }
}
