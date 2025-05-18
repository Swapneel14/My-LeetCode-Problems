import java.util.ArrayList;//Leetcode 78.-->Medium
public class Subsets {
     public static void func(int ind,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>ds,int arr[]){
        int n=arr.length;
        if(ind==n){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[ind]);
        func(ind+1,ans,ds,arr);
        ds.remove(ds.size()-1);
        func(ind+1,ans,ds,arr);

    }
    public static ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>>ans= new ArrayList<>();
        ArrayList<Integer>ds= new ArrayList<>();
        func(0,ans,ds,nums);
        return ans;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList<ArrayList<Integer>>ans=subsets(arr);
        System.out.println(ans);
    }
}
    