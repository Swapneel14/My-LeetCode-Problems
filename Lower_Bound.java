import java.util.*;
public class Lower_Bound {
    public static void main(String[] args) {
        int arr[]={0,2,3,5,6,7,8,9,10,11};
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(solution(arr,x));
    }
    public static int solution(int arr[],int x){
        int n= arr.length;
        int low=0;
        int high = n-1;
        int ans=n;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]>x){
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
