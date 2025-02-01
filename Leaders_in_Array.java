import java.util.*;

public class Leaders_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr= new int[6];
        for(int i=0;i<6;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(solution(arr));


    }
    public static ArrayList solution(int arr[]){
        int max= Integer.MIN_VALUE;
        int n= arr.length;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=(n-1);i>=0;i--){
            if(arr[i]>=max){
                ans.add(arr[i]);
            }
            max= Math.max(max,arr[i]);          
        }
        return ans;

    }
    
}
