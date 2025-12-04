
class Solution {
    public boolean hasPathSum(TreeNode root, int targetsum) {
        if(root==null)return false;
        targetsum-=root.val;
        if(root!=null&&(root.left==null&&root.right==null)){
            return targetsum==0;
        }
        return hasPathSum(root.left,targetsum)||hasPathSum(root.right,targetsum);

    }
}
