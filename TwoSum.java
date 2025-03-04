import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] digits= new int[n];
        for(int i=0;i<n;i++){
            digits[i]=sc.nextInt();

        } 
        int target= sc.nextInt();
        int [] ans = sol(digits,target);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]+" ");
        }
        
    }
     public static int[] sol(int[] nums, int target) {
        int n= nums.length;
        HashMap<Integer,Integer>ans= new HashMap<>();
        for(int i=0;i<n;i++){
            int c=target-nums[i];
            if(ans.containsKey(c)){
                int[] arr={i,ans.get(c)};
                return arr;
            }
            ans.put(nums[i],i);
        }
        int[] arr={};
        return arr;
        
    }
}
