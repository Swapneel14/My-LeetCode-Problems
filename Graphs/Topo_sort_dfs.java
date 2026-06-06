class Solution {
	Stack<Integer>st = new Stack<>();
	boolean visited[];
	
	ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	private void dfs(int u) {
		visited[u] = true;
		
		for (int v : adj.get(u)) {
			if (!visited[v]) {
				dfs(v);
			}
		}
		
		st.push(u);
	}
	
	public ArrayList<Integer> topoSort(int V, int[][] edges) {
		// code here
		
		visited = new boolean[V];
		
		for (int i = 0 ; i < V ; i ++) {
			adj.add(new ArrayList<Integer>());
		}
		
		for (int[]edge : edges) {
			int u = edge[0];
			int v = edge[1];
			
			adj.get(u).add(v);
		}
		
		for (int i = 0 ; i < V ; i++) {
			if (!visited[i])dfs(i);
		}
		
		ArrayList<Integer>ans = new ArrayList<>();
		
		while (!st.isEmpty()) {
			ans.add(st.pop());
		}
		
		return ans;
	}
}
