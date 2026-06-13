class Solution {
    List<List<Integer>> adj = new ArrayList<>();

    public boolean possibleBipartition(int n, int[][] dis) {
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        int[] marked = new int[n + 1];
        Arrays.fill(marked, -1);

        Queue<int[]> q = new LinkedList<>();

        for (int[] edge : dis) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);

        }

        for (int i = 1; i <= n; i++) {
            if (marked[i] != -1)
                continue;

            q.offer(new int[] { i, 0 });
            marked[i] = 0;

            while (!q.isEmpty()) {
                int[] pair = q.poll();
                int u = pair[0];
                int mark = pair[1];

                int next = 1 - mark;

                for (int v : adj.get(u)) {
                    if (marked[v] != -1) {
                        if (marked[v] != next)
                            return false;
                    } else {
                        marked[v] = next;
                        q.offer(new int[] { v, next });
                    }
                }
            }
        }

        return true;

    }
}
