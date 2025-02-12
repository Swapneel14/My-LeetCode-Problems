import java.util.Arrays;
import java.util.Scanner;

public class singlenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] digits= new int[n];
        for(int i=0;i<n;i++){
            digits[i]=sc.nextInt();

        }
        System.out.println(containsDuplicate(digits));
    }
    public  static  boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
