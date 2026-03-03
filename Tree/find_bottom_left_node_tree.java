
class Solution {
    int[] arr = new int[10001];
    int mxlevel = 0;

    private void solve(TreeNode root, int level) {
        if (root == null)
            return;
        arr[level] = root.val;
        mxlevel = Math.max(level, mxlevel);
        solve(root.right, level + 1);
        solve(root.left, level + 1);
    }

    public int findBottomLeftValue(TreeNode root) {
        solve(root, 1);
        return arr[mxlevel];
    }
}
