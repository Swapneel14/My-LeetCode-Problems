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
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer>list2=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
          List<List<Integer>>ans=new ArrayList<>();
          if(root==null)return list2;

          q.add(root);
          while(!q.isEmpty()){
            int size=q.size();
            List<Integer>list=new ArrayList<>();

            for(int i=0;i<size;i++){
               if(q.peek().left!=null)q.add(q.peek().left);
               if(q.peek().right!=null)q.add(q.peek().right);
               list.add(q.remove().val);
            }
            ans.add(list);
          }
          for(int i=0;i<ans.size();i++){
            list2.add(ans.get(i).get(ans.get(i).size()-1));
          }
          return list2;
    }
}
