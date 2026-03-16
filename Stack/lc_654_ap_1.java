
class Solution {
    public TreeNode solve(int[]arr,int start,int end){
        if(start==end){
            TreeNode root = new TreeNode(arr[start]);
            return root;
        }



        if(start>end)return null;

         int max= arr[start],ind=start;
        for(int i=start+1;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
                ind=i;
            }
        }
         TreeNode root = new TreeNode(max);
        root.left=solve(arr,start,ind-1);
        root.right=solve(arr,ind+1,end);

        return root;
    } 

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return solve(nums,0,nums.length-1);
    }
}
