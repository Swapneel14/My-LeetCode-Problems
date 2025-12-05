class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int sum=0;
        int pref[]=new int [n];
        for(int i=0;i<n;i++){
            sum+=nums[i];
            pref[i]=sum;
        }
        int ans=0;
        for(int i=0;i<n-1;i++){
            int left=pref[i];
            int right=sum-pref[i];
            if(Math.abs(left-right)%2==0)ans++;
        }
        return ans;
    }
}
