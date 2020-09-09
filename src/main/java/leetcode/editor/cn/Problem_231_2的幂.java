package leetcode.editor.cn;
//给定一个整数，编写一个函数来判断它是否是 2 的幂次方。 
//
// 示例 1: 
//
// 输入: 1
//输出: true
//解释: 20 = 1 
//
// 示例 2: 
//
// 输入: 16
//输出: true
//解释: 24 = 16 
//
// 示例 3: 
//
// 输入: 218
//输出: false 
// Related Topics 位运算 数学 
// 👍 238 👎 0

/**
 * Java：2的幂
 *
 * @author laijunlin
 * @data 2020-09-08 14:05:08
 */
public class Problem_231_2的幂 {
    public static void main(String[] args) {
        Solution solution = new Problem_231_2的幂().new Solution();
        // TO TEST
        System.out.println(solution.isPowerOfTwo(4));
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n == 0) {
                return false;
            }
            while (n != 1) {
                if (n % 2 != 0) {
                    return false;
                }
                n = n / 2;
            }
            return true;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}


