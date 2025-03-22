import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Next_Grater_Element {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
         int n2=nums2.length;
          int n1=nums1.length;
      int []ans = new int[n2];
      int []fina= new int[n1];
       Stack<Integer>st= new Stack<>();
       HashMap<Integer,Integer>map= new HashMap<>();
    
      for(int i=n2-1;i>=0;i--){
        while(!st.isEmpty()&&nums2[i]>=st.peek()){
            st.pop();
        }
        if(st.isEmpty()){
            ans[i]=-1;
        }
        else{
            ans[i]=st.peek();
        }
        st.push(nums2[i]);
        map.put(nums2[i],ans[i]);
      }
      for(int i=0;i<n1;i++){
        fina[i]=map.get(nums1[i]);
      }
      return fina;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
    {
          arr[i]=sc.nextInt();
    }
    int m=sc.nextInt();
    int arr2[]= new int[m];
    for(int i=0;i<m;i++)
{
      arr2[i]=sc.nextInt();
}
int []ans=nextGreaterElement(arr,arr2);
for(int i=0;i<n;i++){
    System.out.print(ans[i]+" ");
}
}

}
