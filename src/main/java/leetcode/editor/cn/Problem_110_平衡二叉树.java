package leetcode.editor.cn;
//给定一个二叉树，判断它是否是高度平衡的二叉树。 
//
// 本题中，一棵高度平衡二叉树定义为： 
//
// 
// 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。 
// 
//
// 示例 1: 
//
// 给定二叉树 [3,9,20,null,null,15,7] 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回 true 。 
// 
//示例 2: 
//
// 给定二叉树 [1,2,2,3,3,null,null,4,4] 
//
//        1
//      / \
//     2   2
//    / \
//   3   3
//  / \
// 4   4
// 
//
// 返回 false 。 
//
// 
// Related Topics 树 深度优先搜索 
// 👍 502 👎 0

/**
 * Java：平衡二叉树
 *
 * @author laijunlin
 * @data 2020-10-16 15:03:57
 */
public class Problem_110_平衡二叉树 {
    public static void main(String[] args) {
        Solution solution = new Problem_110_平衡二叉树().new Solution();
        // TO TEST
        String[] arr = {"1", null,"2", null, "3"};
        TreeNode tree = Utils.createTree(arr, 0);
        System.out.println( solution.isBalanced(tree));
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
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        boolean result = true;
        int depth = 0;

        public boolean isBalanced(TreeNode root) {

            dfs(root, 1);
            return result;
        }

        private void dfs(TreeNode root, int deep) {
            if (root == null) {
                return;
            }

            if (root.left == null && root.right == null) {
                if (deep > depth) {
                    depth = deep;
                } else {
                    if (depth - deep >= 2) {
                        result = false;
                    }
                }
                return;
            }
            dfs(root.left, ++deep);
            deep--;
            dfs(root.right, ++deep);
            deep--;

        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}


