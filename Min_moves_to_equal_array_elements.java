class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int ans=0,max=nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
          ans+=(max-nums[i]);
        }
        return ans;
    }
}
