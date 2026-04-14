class Solution {
    //Memoization
    // int dp[]=new int[366];
    // int solve(int[]days,int ind,int[]costs){
    //     if(ind==days.length)return 0;

    //     if(dp[ind]!=-1)return dp[ind];

    //     int one = costs[0]+solve(days,ind+1,costs);
    //     int j = ind;
    //     int max_day = days[ind]+7;
    //     while(j<days.length&&days[j]<max_day){
    //         j++;
    //     }
    //     int seven = costs[1]+solve(days,j,costs);
    //     j = ind;
    //     max_day = days[ind]+30;
    //     while(j<days.length&&days[j]<max_day){
    //         j++;
    //     }
    //     int thirty = costs[2]+solve(days,j,costs);

    //     return dp[ind]=Math.min(one,Math.min(seven,thirty));


    // }

    public int mincostTickets(int[] days, int[] costs) {

        // Arrays.fill(dp,-1);
        // return solve(days,0,costs);
        

        //Bottom Up
        int n = days.length;
        int last = days[n-1];
        int t[]= new int[last+1];

        t[0]=0;
        HashSet<Integer>set = new HashSet<>();
        for(int day: days){
            set.add(day);
        }

        for(int i=1;i<=last;i++){
            if(!set.contains(i)){
                t[i]=t[i-1];
                continue;
            }

            t[i]=Integer.MAX_VALUE;
            int one = costs[0] + t[Math.max(0,i-1)];
            int sev = costs[1] + t[Math.max(0,i-7)];
            int thi = costs[2] + t[Math.max(0,i-30)];

            t[i]=Math.min(one,Math.min(sev,thi));
        }

        return t[last];
    }
}
