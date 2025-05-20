import java.util.ArrayList;
public class Permutations {//Leetcode 46--Permutations-->medium
    public static void main(String[] args) {
        int[] arr = {3, 1, 4};
        System.out.println(permute(arr));
    }
    public static  void func(int nums[],ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>ds,boolean freq[]){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                 ds.add(nums[i]);
                 freq[i]=true;
                 func(nums,ans,ds,freq);
                 ds.remove(ds.size()-1);
                 freq[i]=false;

            }
        }
    }
    public static ArrayList<ArrayList<Integer>> permute(int[] nums) {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>ds= new ArrayList<>();
        boolean freq[]= new boolean[nums.length];
        func(nums,ans,ds,freq);
        return ans;
    }
}