/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int height(TreeNode root){
        if(root==null||(root.left==null&&root.right==null)){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null)){
            return 0;
        }
        int leftd=diameterOfBinaryTree(root.left);
        int rightd=diameterOfBinaryTree(root.right);

        int curr=height(root.left)+height(root.right)+(root.left==null?0:1)+(root.right==null?0:1);
        return Math.max(curr,Math.max(leftd,rightd));
    }
}
