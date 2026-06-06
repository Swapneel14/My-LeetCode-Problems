class Solution {
    boolean safe[];
    boolean []visited;
    boolean path[];
    boolean check(int node,int[][]graph){
        visited[node] = true;
        path[node] = true;

        for(int nei : graph[node]){
            if(!visited[nei]){
                if(check(nei,graph))return true;
                
            }
            else if(path[nei])return true;
        }

        path[node] = false;
        safe[node] = true;
        return false;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        safe = new boolean[n];
        path = new boolean[n];
        visited = new boolean[n];

        for(int i = 0 ; i < n ; i++){
            if(!visited[i])check(i,graph);
        }

        List<Integer>ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(safe[i])ans.add(i);
        }

        return ans;
    }
}
