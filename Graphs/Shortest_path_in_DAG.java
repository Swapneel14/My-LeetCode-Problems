// User function Template for Java
class Solution {
	
	boolean[]visited;
	Stack<Integer>st = new Stack<>();
	List<List<int[]>> adj = new ArrayList<>();
	
	void topo(int u) {
		visited[u] = true;
		
		for (int[]arr : adj.get(u)) {
			int v = arr[0];
			int wt = arr[1];
			if (!visited[v])topo(v);
		}
		
		st.push(u);
		
	}
	
	public int[] shortestPath(int V, int E, int[][] edges) {
		// Code here
		
		for (int i = 0 ; i < V ; i++) {
			adj.add(new ArrayList<int[]>());
		}
		
		for (int[]edge : edges) {
			int u = edge[0];
			int v = edge[1];
			int wt = edge[2];
			
			adj.get(u).add(new int[] {v, wt});
		}
		
		visited = new boolean[V];
		
		for (int i = 0 ; i < V ; i++) {
			if (!visited[i])topo(i);
		}
		
		int[]dist = new int[V];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[0] = 0;
		
		while (!st.isEmpty()) {
			int u = st.pop();
			
			for (int[]node : adj.get(u)) {
				int v = node[0];
				int wt = node[1];
				
				if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
					dist[v] = dist[u] + wt;
				}
			}
		}
		
		for(int i = 0 ; i < V ; i++){
		    if(dist[i]==Integer.MAX_VALUE)dist[i] = -1;
		}
		
		return dist;
		
	}
}
