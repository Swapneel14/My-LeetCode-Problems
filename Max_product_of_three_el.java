class Solution {
    public long maxProduct(int[] nums) {
      int n=nums.length;
       long max1=Long.MIN_VALUE;
       long max2=Long.MIN_VALUE;
       for (int x:nums){
        long absx=Math.abs(x);
        if(absx>max1){
            max2=max1;
            max1=absx;
        }
        else if(absx>max2){
            max2=absx;
        }
       }
       return max1*max2*100000;

        
    }
}
