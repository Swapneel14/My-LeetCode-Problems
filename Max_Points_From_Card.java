class Solution {
    public int maxScore(int[] arr, int k) {
        int n=arr.length,lsum=0,rsum=0,max=0,right=n-1;
        for(int i=0;i<=k-1;i++){
            lsum=lsum+arr[i];
        }
        max=Math.max(max,lsum);
        for(int i=k-1;i>=0;i--){
             lsum=lsum-arr[i];
             rsum=rsum+arr[right];
             right--;
             max=Math.max(max,lsum+rsum);
        }
        max=Math.max(max,lsum+rsum);
        return max;
    }
}
