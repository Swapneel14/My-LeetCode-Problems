class Solution {
    int mat[][];
    boolean vis[];
    void dfs(int i){
        vis[i]=true;

        for(int j = 0;j<mat.length;j++){
           if(mat[i][j]==1&&!vis[j]&&i!=j){
            dfs(j);
           }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        vis = new boolean[V];
        mat = isConnected;
        int ans=0;

       for(int i = 0;i<V;i++){
           if(!vis[i]){
             dfs(i);
             ans++;
           }
       }

       return ans;
    }
}
