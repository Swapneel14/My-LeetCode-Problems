class Solution {
    int INF = Integer.MAX_VALUE;
    int[]drow = {0,1,0,-1};
    int[]dcol = {-1,0,1,0};
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        int[][]dist = new int[m][n];
        for(int[]row : dist)Arrays.fill(row,INF);

        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        pq.offer(new int[]{0,0,0});
        dist[0][0] = 0;

        while(!pq.isEmpty()){
            int[]curr = pq.poll();
            int diff = curr[0];
            int row = curr[1];
            int col = curr[2];

            if(row==m-1&&col==n-1)return diff;
            
            for(int i = 0 ; i < 4 ; i++){
                int nrow = row + drow[i];
                int ncol = col + dcol[i];

                if(nrow>=0&&ncol>=0&&nrow<m&&ncol<n){
                    int newdiff = Math.max(Math.abs(heights[row][col] - heights[nrow][ncol]),diff);

                    if(newdiff<dist[nrow][ncol]){
                        dist[nrow][ncol] = newdiff;
                        pq.offer(new int[]{newdiff,nrow,ncol});
                    }
                }
            }

         }

         return 0;
    }
}
