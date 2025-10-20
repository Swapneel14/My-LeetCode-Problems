class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int flag=1;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>lev=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.peek();
                q.remove();
                lev.add(node.val);
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);


            }
            if(flag==1){
                ans.add(lev);
                flag=0;
            }
            else{
                Collections.reverse(lev);
                ans.add(lev);

                flag=1;
            }

        }
        return ans;
    }
}
