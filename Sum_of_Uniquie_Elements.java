import java.util.HashMap;
import java.util.*;

public class Sum_of_Uniquie_Elements {
     public static int sumOfUnique(int[] arr) {
        HashMap<Integer,Integer>map= new HashMap<>();
        int n= arr.length;
        int s=0;
        int c=1;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],c);
            }
        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==1){
                s=s+arr[i];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans= sumOfUnique(arr);
        System.out.println(ans);
    }
}
