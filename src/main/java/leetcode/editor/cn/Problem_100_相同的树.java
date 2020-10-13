package leetcode.editor.cn;
//给定两个二叉树，编写一个函数来检验它们是否相同。 
//
// 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。 
//
// 示例 1: 
//
// 输入:       1         1
//          / \       / \
//         2   3     2   3
//
//        [1,2,3],   [1,2,3]
//
//输出: true 
//
// 示例 2: 
//
// 输入:      1          1
//          /           \
//         2             2
//
//        [1,2],     [1,null,2]
//
//输出: false
// 
//
// 示例 3: 
//
// 输入:       1         1
//          / \       / \
//         2   1     1   2
//
//        [1,2,1],   [1,1,2]
//
//输出: false
// 
// Related Topics 树 深度优先搜索 
// 👍 465 👎 0

/**
 * Java：相同的树
 *
 * @author laijunlin
 * @data 2020-09-10 16:43:25
 */
public class Problem_100_相同的树 {
    public static void main(String[] args) {
        Solution solution = new Problem_100_相同的树().new Solution();
        // TO TEST
        String[] p = {"1", "2", "3"};
        String[] q = new String[]{"1", "2", "2"};
        TreeNode treeP = Utils.createTree(p, 3);
        TreeNode treeQ = Utils.createTree(q, 3);
        System.out.println(solution.isSameTree(treeP, treeQ));
        ;
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

        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            }
            dfs(p, q);
            return result;
        }

        private void dfs(TreeNode p, TreeNode q) {
            if (!result) {
                return;
            }
             if (p == null || q == null) {
                 result= false;
                 return;
            } else if (p.val != q.val) {
                 result= false;
                 return;
            }
            isSameTree(p.left, q.left);
            isSameTree(p.right, q.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


