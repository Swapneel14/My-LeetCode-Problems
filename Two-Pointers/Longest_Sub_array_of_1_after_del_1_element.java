class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;

        int low = 0, high = 0;
        int zeros = 0;
        int ans = 0;

        while(low<=high && high<n){
            if(nums[high]==0)zeros++;

            if(zeros<=1)ans = Math.max(ans,high - low);

            else{
                while(nums[low]!=0)low++;
                low++;
                zeros--;
            }

            high++;
        }

        return ans;
    }
}
