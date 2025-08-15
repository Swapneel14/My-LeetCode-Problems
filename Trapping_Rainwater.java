//Approach 1
// TC O(3N) SC O(2N)
class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int lmax[]=new int[n];
        int rmax[]=new int[n];
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }
        lmax[0]=arr[0];
        for(int i=1;i<=n-1;i++){
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        }
        int total=0;
        for(int i = 0;i<n;i++){
            if(arr[i]<lmax[i]&&arr[i]<rmax[i]){
                total+=(Math.min(lmax[i],rmax[i])-arr[i]);
            }
        }
        return total;
    }
}
