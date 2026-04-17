class Solution {
    class Pair{
        int row, col;
        public Pair(int row,int col){
            this.row = row;
            this.col = col;
        }
    }
    boolean visited[][];
    void bfs(char[][]grid,int i, int j){
        visited[i][j]=true;
        if(grid[i][j]=='0')return ;
        Queue<Pair>q = new LinkedList<>();
        q.add(new Pair(i,j));
        int n = grid.length;
        int m = grid[0].length;


        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            q.remove();

             for(int k = 0; k < 4; k++){
                int r = row + dr[k];
                int c = col + dc[k];

                if(r >= 0 && r < n && c >= 0 && c < m &&
                   grid[r][c] == '1' && !visited[r][c]) {

                    visited[r][c] = true;
                    q.add(new Pair(r, c));
                }
            }
        }

    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        visited = new boolean[n][m];
        int ans= 0 ;

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ;j <m;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    bfs(grid,i,j);
                    ans++;
                }
            }
        }

        return ans;

    }
}
