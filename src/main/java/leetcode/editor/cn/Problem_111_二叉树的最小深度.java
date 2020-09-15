package leetcode.editor.cn;
//给定一个二叉树，找出其最小深度。 
//
// 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例: 
//
// 给定二叉树 [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最小深度 2. 
// Related Topics 树 深度优先搜索 广度优先搜索 
// 👍 365 👎 0

/**
 * Java：二叉树的最小深度
 *
 * @author laijunlin
 * @data 2020-09-14 09:55:35
 */
public class Problem_111_二叉树的最小深度 {
    public static void main(String[] args) {
        Solution solution = new Problem_111_二叉树的最小深度().new Solution();
        // TO TEST
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        private int min = Integer.MAX_VALUE;

        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            dfs(root, 1);
            return min;
        }

        private void dfs(TreeNode root, int depth) {
            if (root == null) {
                return;
            }
            depth++;
            if (root.left == null && root.right == null) {
                if (depth < min) {
                    min = depth;
                }
                return;
            }
            dfs(root.left, depth);
            dfs(root.right, depth);
            //depth--;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


