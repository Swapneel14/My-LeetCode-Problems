import java.util.ArrayList;//Leetcode 90--Subsets II-->medium
import java.util.Arrays;
public  class SubsetsII{
     public static void func(int[] nums,ArrayList<ArrayList<Integer>>ans, ArrayList<Integer>ds,int ind){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind &&nums[i]==nums[i-1]){
                continue;
            }
            ds.add(nums[i]);
            func(nums,ans,ds,i+1);
            ds.remove(ds.size()-1);
        }
    }
    public static ArrayList<ArrayList<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>ds=new ArrayList<>();
        func(nums,ans,ds,0);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2,2};
        ArrayList<ArrayList<Integer>> result = subsetsWithDup(nums);
        System.out.println(result);
    
}
}