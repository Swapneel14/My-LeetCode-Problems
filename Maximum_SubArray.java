public class Maximum_SubArray{
    
    public static  int maxSubArray(int[] nums) {
       int curr=nums[0];
       int max=nums[0];
       for(int i=1;i<nums.length;i++){
        curr=Math.max(nums[i],curr+nums[i]);
        max=Math.max(curr,max);
       }
       return max;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,-4,6,-9,0,2,19,2,-3};
        System.out.println(maxSubArray(arr));
    }
}