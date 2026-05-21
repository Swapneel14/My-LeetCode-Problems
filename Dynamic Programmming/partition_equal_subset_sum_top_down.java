class Solution {
    int dp[][];
    private boolean solve(int[]nums,int target,int ind){
        if(target==0)return true;
        if(target<0||ind==nums.length)return false;

        if(dp[ind][target]!=-1)return dp[ind][target]==1?true:false;
     
        boolean ans = solve(nums,target,ind+1)||solve(nums,target-nums[ind],ind+1);
        
        dp[ind][target]=(ans)?1:0;
        return ans;
    }

    public boolean canPartition(int[] nums) {
        int sum = 0 ;
        int n = nums.length;
        for(int x: nums){
            sum+=x;
        }

        if(sum%2==1)return false;
        int target = sum/2;

        dp = new int[n+1][target+1];

        for(int d[]:dp){
           Arrays.fill(d,-1);
        }

        return solve(nums,target,0);

    }
}
