class Solution {
    public boolean validPath(int n, int[][] edges, int source, int des) {
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int[]pair : edges){
            int u = pair[0];
            int v = pair[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        Queue<Integer>q = new LinkedList<>();
        boolean  visited[] = new boolean[n];
        q.offer(source);
        visited[source]=true;

        while(!q.isEmpty()){
            int v = q.poll();
            if(v==des)return true;

            for(int nei : adj.get(v)){
                if(!visited[nei]){
                    q.offer(nei);
                    visited[nei] = true;
                }
            }
        }

        return false;
        
    }
}
