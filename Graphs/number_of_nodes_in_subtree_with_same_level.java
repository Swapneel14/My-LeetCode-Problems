class Solution {
    int[]ans ;
    List<List<Integer>>adj = new ArrayList<>();
    
    private void solve(int u,int[]freq,String labels,int parent){
         char ch = labels.charAt(u);
         freq[ch-'a']++;

         int[]c_freq = new int[26];

         for(int v : adj.get(u)){
            if(v==parent)continue;
            solve(v,c_freq,labels,u);
         }

         for(int i = 0 ; i < 26 ; i++){
            freq[i] += c_freq[i];
         }

         ans[u] = c_freq[ch-'a'] + 1;

    }

    public int[] countSubTrees(int n, int[][] edges, String labels) {
      

       ans = new int[n];

       for(int i = 0 ; i < n ; i++){
        adj.add(new ArrayList<Integer>());
       }
        
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

           adj.get(u).add(v);
           adj.get(v).add(u);
        }

        int[]freq = new int[26];

        solve(0,freq,labels,-1);
        return ans;
    }
}
