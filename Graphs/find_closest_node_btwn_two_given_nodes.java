class Solution {
    private int[] solve(int[]edges,int src){
        int n = edges.length;
        int[]dist = new int[n];
        Arrays.fill(dist,-1);

        int curr = 0;

        while(src!=-1&&dist[src]==-1){
            dist[src] = curr;
            curr++;
            src = edges[src];
        }

        return dist;
    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int[]d1 = solve(edges,node1);
        int[]d2 = solve(edges,node2);
        int n = edges.length;
        
        int ans = n+1;
        int curr = Integer.MAX_VALUE;

        for(int i = 0 ; i < n ; i++ ){
            if(d1[i]!=-1&&d2[i]!=-1){
               int dist = Math.max(d1[i],d2[i]);
               if(dist<curr){
                curr = dist;
                ans = i;
               }
            }
        }
        if(ans == n+1)return -1;
        return ans;
    }
}
