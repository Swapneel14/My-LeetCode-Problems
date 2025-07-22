class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int ans=0,start=0,n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        int end=0;
        int curr=0;
        while(end<n){
            while(set.contains(nums[end])){
                  set.remove(nums[start]);
                  curr=curr-nums[start];
                  start++;
            }
            set.add(nums[end]);
            curr+=nums[end];
            end++;
            ans=Math.max(ans,curr);
        }
        return ans;
    }
}
