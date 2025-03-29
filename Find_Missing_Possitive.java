import java.util.Arrays;
import java.util.Scanner;

public class Find_Missing_Possitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(firstMissingPositive(arr));
        
    }
     public static int firstMissingPositive(int[] nums) {
         int n= nums.length;
        Arrays.sort(nums);
        int c=0;
        int x=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                 c=i;
                x=nums[i];
                break;
            }
            if(i==n-1){
                return 1;
            }
        }
       
        int ans=nums[n-1];
        if(x>1)return 1;
        else{
           for(int j=c;j<n-1;j++){
            if(nums[j+1]!=nums[j]+1&&nums[j+1]!=nums[j]){
                 ans=nums[j];
                break;
            }
           }
           return ans+1;
        }
      

    }
}
