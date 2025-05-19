public class Maximum_product_subarray {//Leetcode 152--Maximum Product Subarray-->medium
     public static int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int suf=1;
        int pref=1;
        for(int i=0;i<n;i++){
           if(pref==0)pref=1;
           if(suf==0)suf=1;
           pref=pref*nums[i];
           suf=suf*nums[n-1-i];
           max=Math.max(max,Math.max(pref,suf));
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {2, -5, 0, 3, -2, 4, -1};
        
        int result = maxProduct(nums);
        System.out.println("Maximum product subarray: " + result);
    }
}