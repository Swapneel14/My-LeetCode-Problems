
class Solution {
    TreeNode solve(TreeNode root,int low,int high,TreeNode ans){
         if(root==null)return null;
          if(root.val<low){
            return solve(root.right,low,high,ans);
          }
          if(root.val>high){
            return solve(root.left,low,high,ans);
          }
          ans.val=root.val;
          TreeNode left = new TreeNode(-1);
          TreeNode right = new TreeNode(-1);
          ans.right=solve(root.right,low,high,right);
          ans.left=solve(root.left,low,high,left);
          return ans;
    }

    public TreeNode trimBST(TreeNode root, int low, int high) {
        TreeNode ans = new TreeNode(-1);
        ans=solve(root,low,high,ans);
        return ans;
    }
}
