package leetcode.editor.cn;
//给定一个二进制数组， 计算其中最大连续1的个数。 
//
// 示例 1: 
//
// 
//输入: [1,1,0,1,1,1]
//输出: 3
//解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
// 
//
// 注意： 
//
// 
// 输入的数组只包含 0 和1。 
// 输入数组的长度是正整数，且不超过 10,000。 
// 
// Related Topics 数组 
// 👍 138 👎 0

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

/**
 * Java：最大连续1的个数
 *
 * @author laijunlin
 * @data 2020-11-03 12:17:36
 */
public class Problem_485_最大连续1的个数 {
    public static void main(String[] args) {
        Solution solution = new Problem_485_最大连续1的个数().new Solution();
        // TO TEST
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            int max = -1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == 1) {
                    dp[i] = dp[i - 1] + 1;
                }else{
                    if(max < dp[i-1]){
                        max = dp[i-1];
                    }
                }
            }
            if(max>dp[dp.length-1]){
                return max;
            }
            else{
                return dp[dp.length-1];
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


