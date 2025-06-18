class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
       int ans[][]=new int[n/3][3];
       int p=0;

        for (int i = 0; i < nums.length; i += 3) {
            if ( nums[i + 2] - nums[i] > k) {
                int a[][]={};
                return a;
            }
            ans[p][0]=nums[i];
            ans[p][1]=nums[i+1];
            ans[p][2]=nums[i+2];
            p++;
        }

        return ans;
    }
}
