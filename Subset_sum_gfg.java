import java.util.ArrayList;//gfg-->medium
public  class Subset_sum_gfg {
     public static  void func(int ind,int sum,ArrayList<Integer>list,int []arr){
        if(ind==arr.length){
            list.add(sum);
            return;
        }
        func(ind+1,sum+arr[ind],list,arr);
        func(ind+1,sum,list,arr);
    }
    public static ArrayList<Integer> Sums(int[] arr) {
        // code here
        ArrayList<Integer>list= new ArrayList<>();
        func(0,0,list,arr);
        return list;
    }
public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList<Integer>ans=Sums(arr);
        System.out.println(ans);
    }
}