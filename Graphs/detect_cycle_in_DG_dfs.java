class Solution {
    List<List<Integer>>adj = new ArrayList<>();
    int n;
    boolean[]vis ;
    boolean[]pathvis;
    
    private boolean dfs(int u){
        vis[u] = true;
        pathvis[u] = true;
        
        for(int v : adj.get(u)){
            if(!vis[v]){
                if(dfs(v))return true;
            }
            
            else if(pathvis[v])return true;
        }
        
        pathvis[u] = false;
        return false;
        
    }
    
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        n = V;
        vis = new boolean[n];
        pathvis = new boolean[n];
        for(int i = 0 ; i < V ; i++){
            adj.add(new ArrayList<Integer>());
        }
        
        for(int[]edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
        }
        
        for(int i = 0 ; i < V ; i++){
            if(!vis[i]){
                if(dfs(i))return true;
            }
        }
        
        return false;
        
    }
}
