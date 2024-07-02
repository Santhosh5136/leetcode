class Solution {
    private int maxdepth = 0;
    private int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode rot, int depth) {
        if (rot == null) {
            return;
        }

        if (rot.left == null && rot.right == null) { 
            if (maxdepth < depth) {
                maxdepth = depth;
                sum = rot.val;
            } else if (maxdepth == depth) {
                sum += rot.val;
            }
        }

        dfs(rot.left, depth + 1); 
        dfs(rot.right, depth + 1);
    }
}