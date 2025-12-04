class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        TreeNode prevleft=invertTree(root.left);
        TreeNode prevright=invertTree(root.right);
       
        

        root.left=prevright;
        root.right=prevleft;

        return root;


    }
}
