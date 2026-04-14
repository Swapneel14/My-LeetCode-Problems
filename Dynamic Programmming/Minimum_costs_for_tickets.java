class Solution {
    int dp[]=new int[366];
    int solve(int[]days,int ind,int[]costs){
        if(ind==days.length)return 0;

        if(dp[ind]!=-1)return dp[ind];

        int one = costs[0]+solve(days,ind+1,costs);
        int j = ind;
        int max_day = days[ind]+7;
        while(j<days.length&&days[j]<max_day){
            j++;
        }
        int seven = costs[1]+solve(days,j,costs);
        j = ind;
        max_day = days[ind]+30;
        while(j<days.length&&days[j]<max_day){
            j++;
        }
        int thirty = costs[2]+solve(days,j,costs);

        return dp[ind]=Math.min(one,Math.min(seven,thirty));


    }

    public int mincostTickets(int[] days, int[] costs) {

        Arrays.fill(dp,-1);
        return solve(days,0,costs);
        
    }
}
