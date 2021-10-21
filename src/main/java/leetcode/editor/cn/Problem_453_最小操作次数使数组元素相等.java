package leetcode.editor.cn;
//给你一个长度为 n 的整数数组，每次操作将会使 n - 1 个元素增加 1 。返回让数组所有元素相等的最小操作次数。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：3
//解释：
//只需要3次操作（注意每次操作会增加两个元素的值）：
//[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,1,1]
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// n == nums.length 
// 1 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// 答案保证符合 32-bit 整数 
// 
// Related Topics 数组 数学 👍 384 👎 0


/**
 * Java：最小操作次数使数组元素相等
 *
 * @author laijunlin
 * @data 2021-10-21 14:44:18
 */
public class Problem_453_最小操作次数使数组元素相等 {
    public static void main(String[] args) {
        Solution solution = new Problem_453_最小操作次数使数组元素相等().new Solution();
        int[] nums = new int[]{1, 2, 3};
        System.out.println(solution.minMoves(nums));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minMoves(int[] nums) {
            int minVal = Integer.MAX_VALUE;
            for (int n : nums) {
                minVal = Math.min(minVal, n);
            }
            int res = 0;
            for (int n : nums) {
                res = res + n - minVal;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}