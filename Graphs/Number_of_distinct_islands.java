// User function Template for Java

class Solution {
	int[][]visited;
	
	class Pair {
		int first;
		int second;
		
		public Pair(int f, int s) {
			first = f;
			second = s;
		}
		
		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			
			if (o == null || getClass() != o.getClass())
				return false;
			
			Pair p = (Pair)o;
			
			return first == p.first && second == p.second;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(first, second);
		}
	}
	
	void dfs(int row, int col, int[][]grid, int row0, int col0, ArrayList<Pair>list) {
		visited[row][col] = 1;
		list.add(new Pair(row - row0, col - col0));
		
		int m = grid.length;
		int n = grid[0].length;
		
		int[]delrow = {0, 1, 0, -1};
		int[]delcol = {-1, 0, 1, 0};
		
		for (int i = 0 ; i < 4 ; i++) {
			int nrow = row + delrow[i];
			int ncol = col + delcol[i];
			
			if (nrow >= 0 && nrow<m && ncol >= 0 && ncol<n && visited[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
				dfs(nrow, ncol, grid, row0, col0, list);
			}
		}
	}
	
	int countDistinctIslands(int[][] grid) {
		// Your Code here
		int m = grid.length;
		int n = grid[0].length;
		visited = new int[m][n];
		
		HashSet<ArrayList<Pair>> set = new HashSet<>();
		
		for (int i = 0 ; i < m ; i++) {
			for (int j = 0 ; j < n ; j++) {
				if (grid[i][j] == 1 && visited[i][j] == 0) {
					ArrayList<Pair>list = new ArrayList<>();
					dfs(i, j, grid, i, j, list);
					set.add(list);
				}
			}
		}
		
		return set.size();
		
	}
}
