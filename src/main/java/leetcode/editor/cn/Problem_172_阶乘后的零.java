package leetcode.editor.cn;
//给定一个整数 n，返回 n! 结果尾数中零的数量。 
//
// 示例 1: 
//
// 输入: 3
//输出: 0
//解释: 3! = 6, 尾数中没有零。 
//
// 示例 2: 
//
// 输入: 5
//输出: 1
//解释: 5! = 120, 尾数中有 1 个零. 
//
// 说明: 你算法的时间复杂度应为 O(log n) 。 
// Related Topics 数学 
// 👍 346 👎 0

/**
 * Java：阶乘后的零
 *
 * @author laijunlin
 * @data 2020-09-07 15:55:37
 */
public class Problem_172_阶乘后的零 {
    public static void main(String[] args) {
        Solution solution = new Problem_172_阶乘后的零().new Solution();
        // TO TEST
        System.out.println(solution.trailingZeroes(5));
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int trailingZeroes(int n) {
            int result = 0;
            int count = 1;
            for (int i = 1; i <= n; i++) {
                count = count * i;
                int temp = count;
                while(temp %10 ==0){

                }

            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


