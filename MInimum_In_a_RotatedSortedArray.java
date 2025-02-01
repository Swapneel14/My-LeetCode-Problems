public class MInimum_In_a_RotatedSortedArray {
    public static void main(String[] args) {
        int arr[]={6,7,8,9,3,4,5};
        System.out.println(solution(arr,arr.length));
    }
    public static int solution(int arr[],int n){
        int ans= 10000009;
        int low=0;
        int high = n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                ans=Math.min(ans,arr[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
}
