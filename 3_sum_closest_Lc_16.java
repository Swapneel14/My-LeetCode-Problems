class Solution {
    public int threeSumClosest(int[] nums, int t) {
        Arrays.sort(nums);
        int n=nums.length;
        int mindif=Integer.MAX_VALUE;
        int ans=0;
       for(int i=0;i<n;i++){
        int j=i+1;
        int k=n-1;
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
           if(Math.abs(t-sum)<mindif){
            ans=sum;
            mindif=Math.abs(t-sum);
           }
           if(sum<t)j++;
           else k--;
        }
       }
       return ans;
    }
}
