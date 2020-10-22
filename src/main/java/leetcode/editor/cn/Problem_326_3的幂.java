package leetcode.editor.cn;
//给定一个整数，写一个函数来判断它是否是 3 的幂次方。 
//
// 示例 1: 
//
// 输入: 27
//输出: true
// 
//
// 示例 2: 
//
// 输入: 0
//输出: false 
//
// 示例 3: 
//
// 输入: 9
//输出: true 
//
// 示例 4: 
//
// 输入: 45
//输出: false 
//
// 进阶： 
//你能不使用循环或者递归来完成本题吗？ 
// Related Topics 数学 
// 👍 131 👎 0

/**
 * Java：3的幂
 *
 * @author laijunlin
 * @data 2020-10-22 10:17:50
 */
public class Problem_326_3的幂 {
    public static void main(String[] args) {
        Solution solution = new Problem_326_3的幂().new Solution();
        // TO TEST
        solution.isPowerOfThree(-3);
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPowerOfThree(int n) {
            if (n > 0) {
                while (n > 1) {
                    if (n % 3 != 0) {
                        return false;
                    }
                    n = n / 3;
                }
            } else {
                return false;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


