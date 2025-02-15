 import java.util.*;
 public class containsDuplicate2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] digits= new int[n];
        for(int i=0;i<n;i++){
            digits[i]=sc.nextInt();

        }
        System.out.println(containsNearbyDuplicate(digits, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n= nums.length;
        Map<Integer,Integer>seen= new HashMap<>();
        for(int i=0;i<n;i++){
            int key = nums[i];
            if(seen.containsKey(key)&&i-seen.get(key)<=k){
                return true;
            }
            seen.put(key,i);
        }
        return false;
    }
}
