class Solution {//Leetcode 2294-->medium
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int x=0;
        int count=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-nums[x]>k){
                count++;
                x=i;
            }
        }
        return count;

    }
}
