class Solution {
    boolean safe[];
    boolean check(int node,int[][]graph,boolean[]visited){
         if(graph[node].length==0||safe[node])return true;
         if(visited[node])return false;
         
         visited[node] = true;

         boolean ans = true;

         for(int nei : graph[node]){
            ans = ans && check(nei,graph,visited);
         }

         visited[node] = false;

         return ans;

    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        safe = new boolean[n];

        for(int i = 0 ; i < n ; i++){
            boolean visited[] = new boolean[n];
            safe[i] = check(i,graph,visited);
        }

        List<Integer>ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(safe[i])ans.add(i);
        }

        return ans;
    }
}
