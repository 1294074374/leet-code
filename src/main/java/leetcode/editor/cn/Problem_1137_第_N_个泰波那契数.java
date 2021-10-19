package leetcode.editor.cn;
//泰波那契序列 Tn 定义如下： 
//
// T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2 
//
// 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。 
//
// 
//
// 示例 1： 
//
// 输入：n = 4
//输出：4
//解释：
//T_3 = 0 + 1 + 1 = 2
//T_4 = 1 + 1 + 2 = 4
// 
//
// 示例 2： 
//
// 输入：n = 25
//输出：1389537
// 
//
// 
//
// 提示： 
//
// 
// 0 <= n <= 37 
// 答案保证是一个 32 位整数，即 answer <= 2^31 - 1。 
// 
// Related Topics 记忆化搜索 数学 动态规划 👍 141 👎 0


/**
 * Java：第 N 个泰波那契数
 *
 * @author laijunlin
 * @data 2021-10-19 15:44:18
 */
public class Problem_1137_第_N_个泰波那契数 {
    public static void main(String[] args) {
        Solution solution = new Problem_1137_第_N_个泰波那契数().new Solution();
        System.out.println(solution.tribonacci(25));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int tribonacci(int n) {
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            int p = 0, q = 0, r = 1, s = 1;
            for (int i = 2; i < n; i++) {
                p = q;
                q = r;
                r = s;
                s = q + r + p;
            }

            return s;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}