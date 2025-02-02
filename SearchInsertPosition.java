import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int X=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(searchInsert(nums,X));
    }
    static int searchInsert(int[] arr, int x) {
        int n= arr.length;
       int low=0;
       int high = n-1;
       int ans=n;
       while(low<=high){
           int mid= (low+high)/2;
           if(arr[mid]>=x){
               ans=mid;
               high=mid-1;

           }
           else{
                low=mid+1;
           }
       }
       return ans;

       
   }
}
