package leetcode.editor.cn;
//给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例: 
//给定如下二叉树，以及目标和 sum = 22， 
//
//               5
//             / \
//            4   8
//           /   / \
//          11  13  4
//         /  \      \
//        7    2      1
// 
//
// 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。 
// Related Topics 树 深度优先搜索 
// 👍 420 👎 0

/**
 * Java：路径总和
 *
 * @author laijunlin
 * @data 2020-09-10 11:13:47
 */
public class Problem_112_路径总和 {
    public static void main(String[] args) {
        Solution solution = new Problem_112_路径总和().new Solution();
        // TO TEST
        String [] arr = {"5","4","8","11",null,"13","4","7","2",null,null,null,"1"};
        TreeNode tree = Utils.createTree(arr,0);
        System.out.println(solution.hasPathSum(tree, 22));

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
        private int count = 0;
        private int target;
        private boolean result = false;

        public boolean hasPathSum(TreeNode root, int sum) {
            this.target = sum;
            dfs(root);
            return result;
        }

        private void dfs(TreeNode root) {
            if (root == null) {
                return;
            }
            count = count + root.val;
            if (root.left == null && root.right == null) {
                if (count == target) {
                    result = true;
                }
                count = count - root.val;
                return;
            }
            dfs(root.left);
            dfs(root.right);
            count = count - root.val;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


