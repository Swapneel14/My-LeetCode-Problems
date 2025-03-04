import java.util.Scanner;

public class Jump_Game2 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] digits= new int[n];
        for(int i=0;i<n;i++){
            digits[i]=sc.nextInt();

        } 
        System.out.println(jump(digits));
        
    }
    public static int jump(int[] nums) {
        int n= nums.length;
        int near=0,far=0,jumps=0;
    while(far<n-1){
        int farthest=0;
        for(int i=near;i<=far;i++){
            farthest=Math.max(farthest,i+nums[i]);
        }
            near=far+1;
            far=farthest;
            jumps++;
        
    }
    return jumps;
        
    }
}
