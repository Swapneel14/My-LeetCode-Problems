class Solution {
    public int maxDistance(int[] arr, int m) {
        Arrays.sort(arr);
        int n=arr.length;
        int low=1;
        int ans=0;
        int high= arr[n-1]-arr[0];
        while(low<=high){
            
            int mid=low+(high-low)/2;
            if(can(arr,mid,m)){
                ans=mid;
                low=mid+1;
            }
            else
               high=mid-1;
            }
            return ans;
        }
    
    public boolean can(int arr[],int mindis,int m){
             int n=arr.length;
             int last=arr[0];
             int count=1;
             for(int i=1;i<n;i++){
                if(arr[i]-last>=mindis){
                    last=arr[i];
                    count++;
                }
             }
             return count>=m;
    }
}
