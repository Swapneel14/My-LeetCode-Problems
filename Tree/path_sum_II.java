
class Solution {
    public void helper(TreeNode root, List<List<Integer>>ans,List<Integer>arr,int sum){
        if(root==null)return;
        if(root.left==null&&root.right==null){
            arr.add(root.val);
            if(root.val==sum){
                ans.add(new ArrayList<>(arr));
            }
            arr.remove(arr.size()-1);
            return ;
        }
        arr.add(root.val);
        helper(root.left,ans,arr,sum-root.val);
        helper(root.right,ans,arr,sum-root.val);
        arr.remove(arr.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        helper(root,ans,arr,sum);
        return ans;

    }
}
