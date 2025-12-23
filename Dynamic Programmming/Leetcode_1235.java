class Solution {
    public int get(int[][]arr,int ind){
        int n=arr.length;
        int l=ind+1;
        int target=arr[ind][1];
        int r=n-1;
        
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid][0]>=target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public int solve(int[][]arr,int ind,int[]dp){

        int n=arr.length;
        
        if(ind>=n)return 0;
        if(dp[ind]!=-1)return dp[ind];
        int nextind= get(arr,ind);
        int taken=arr[ind][2]+solve(arr,nextind,dp);
        int nottaken=solve(arr,ind+1,dp);
        return dp[ind]= Math.max(taken,nottaken);
    }
    public int jobScheduling(int[] start, int[] end, int[] pro) {
        int n=start.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int[][]arr=new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=start[i];
            arr[i][1]=end[i];
            arr[i][2]=pro[i];
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        return solve(arr,0,dp);

    }
}
