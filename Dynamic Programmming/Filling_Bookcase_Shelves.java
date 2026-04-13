class Solution {
    int n;
    int w;
    int dp[][]= new int[1001][1001];
    int solve(int[][]books,int ind,int width,int height){
        if(ind==n)return height;
        if(dp[ind][width]!=-1)return dp[ind][width];
        int h=books[ind][1];
        int wt=books[ind][0];

        int take = Integer.MAX_VALUE;
        int not_take = height+solve(books,ind+1,w-wt,h);

        if(wt<=width){
            take = solve(books,ind+1,width-wt,Math.max(height,h));
        }

        return dp[ind][width]=Math.min(take,not_take);
    }

    public int minHeightShelves(int[][] books, int shelfWidth) {
        n = books.length;
        w = shelfWidth;

        for(int d[]:dp){
            Arrays.fill(d,-1);
        }

        return solve(books,0,shelfWidth,0);

    }
}
