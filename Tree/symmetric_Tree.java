class Solution {
    public boolean sym(TreeNode n1,TreeNode n2){
        if(n1==null&&n2==null)return true;
        if(n1==null||n2==null)return false;

        return n1.val==n2.val&& sym(n1.left,n2.right)&& sym(n1.right,n2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null))return true;
        return sym(root.left,root.right);
    }
}
