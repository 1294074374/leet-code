package leetcode.editor.cn;
//计算给定二叉树的所有左叶子之和。 
//
// 示例： 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24 
//
// 
// Related Topics 树 
// 👍 247 👎 0

/**
 * Java：左叶子之和 
 
 * @author laijunlin
 * @data 2020-10-26 17:28:40
 */
public class Problem_404_左叶子之和{
    public static void main(String[] args) {
        Solution solution = new Problem_404_左叶子之和().new Solution();
        // TO TEST
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int result = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root);
        return 0;
    }

    private void dfs(TreeNode root) {
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            return;
        }
        if(root.left!=null){
            result += root.left.val;
        }
        dfs(root.left);
        dfs(root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


