package leetcode.editor.cn;
//给定一个二叉树，找出其最大深度。 
//
// 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例： 
//给定二叉树 [3,9,20,null,null,15,7]， 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最大深度 3 。 
// Related Topics 树 深度优先搜索 
// 👍 694 👎 0

/**
 * Java：二叉树的最大深度
 *
 * @author laijunlin
 * @data 2020-09-11 09:25:53
 */
public class Problem_104_二叉树的最大深度 {
    public static void main(String[] args) {
        Solution solution = new Problem_104_二叉树的最大深度().new Solution();
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
        private int maxDepth = Integer.MIN_VALUE;

        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }

            dfs(root, 0);
            return maxDepth;
        }

        private void dfs(TreeNode root, int i) {
            if (root == null) {
                return;
            }
            // 深度加一
            i++;
            // 已到达叶子节点
            if (root.left == null && root.right == null) {
                if (i > maxDepth) {
                    maxDepth = i;
                }
                return;
            }
            dfs(root.left, i);
            dfs(root.right, i);
            i = i--;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


