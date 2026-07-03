class Solution {
    List<List<Integer>> adj = new ArrayList<>();
    boolean[] visited;

    int dfs(int node) {
        visited[node] = true;
        int size = 1;

        for (int nei : adj.get(node)) {
            if (!visited[nei]) {
              size += dfs(nei);
            }
        }
        return size;
    }

    public long countPairs(int n, int[][] edges) {
        long ans = 0;
        visited = new boolean[n];

        List<Long> sizes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {

                int size = dfs(i);
                sizes.add((long)size);
            }
        }

        int len = sizes.size();
        long remaining = n;

        for (long size : sizes) {
            remaining -= size;
            ans += size * remaining;
        }

        return ans;

    }
}
