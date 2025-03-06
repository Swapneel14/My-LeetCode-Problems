import java.util.Scanner;

public class leetcode2154 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findFinalValue(arr, original));
    }
    public static int findFinalValue(int[] arr, int o) {
        int n= arr.length;
        int i=0;
        while(i<n){
            if(arr[i]==o){
                o=o*2;
                i=0;
            }
            else{
                i++;
            }
           
        }
        return o;
    }
}