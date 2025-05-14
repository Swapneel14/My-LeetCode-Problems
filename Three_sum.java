import java.util.*;
public class Three_sum{
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            HashSet<Integer>set=new HashSet<>();
            for(int j=i+1;j<n;j++){
               int third=-(nums[i]+nums[j]);
               if(set.contains(third)){
                int arr[]={nums[i],nums[j],third};
                Arrays.sort(arr);
                List<Integer> triplet = Arrays.asList(arr[0], arr[1], arr[2]);
               if (!ans.contains(triplet)) {
                 ans.add(triplet);
                }

               }
               set.add(nums[j]);

            }
        }
        return ans;
    }
    public static List<List<Integer>> threeSum2(int[] nums) {
       List<List<Integer>>ans= new ArrayList<>();
       Arrays.sort(nums);
       int n=nums.length;
       for(int i=0;i<n;i++){
        if(i>0&&nums[i]==nums[i-1]){
            continue;
        }
        int j=i+1;
        int k=n-1;
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum <0){
                j++;
            }
            else if(sum>0){
                k--;
            }
            else{
                List<Integer>list=Arrays.asList(nums[i],nums[j],nums[k]);
                ans.add(list);
                j++;
                k--;
                while(j<k&&nums[j]==nums[j-1])j++;
                while(j<k&&nums[k]==nums[k+1])k--;
            }
        }
       }
       return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
        System.out.println(threeSum2(nums));
        
    }
}