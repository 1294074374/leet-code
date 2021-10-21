package leetcode.editor.cn;
//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。 
//
// 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-4,-1,0,3,10]
//输出：[0,1,9,16,100]
//解释：平方后，数组变为 [16,1,0,9,100]
//排序后，数组变为 [0,1,9,16,100] 
//
// 示例 2： 
//
// 
//输入：nums = [-7,-3,2,3,11]
//输出：[4,9,9,49,121]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums 已按 非递减顺序 排序 
// 
//
// 
//
// 进阶： 
//
// 
// 请你设计时间复杂度为 O(n) 的算法解决本问题 
// 
// Related Topics 数组 双指针 排序 👍 324 👎 0


import java.util.Arrays;

/**
 * Java：有序数组的平方
 *
 * @author laijunlin
 * @data 2021-10-20 13:55:54
 */
public class Problem_977_有序数组的平方 {
    public static void main(String[] args) {
        Solution solution = new Problem_977_有序数组的平方().new Solution();
        int[] arr = {-4, -1, 0, 3, 10};
        Utils.printArray(solution.sortedSquares(arr));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int negative = -1;
            for (int i = 0; i < n; ++i) {
                if (nums[i] < 0) {
                    negative = i;
                } else {
                    break;
                }
            }

            int[] ans = new int[n];
            int index = 0, i = negative, j = negative + 1;
            while (i >= 0 || j < n) {
                if (i < 0) {
                    ans[index] = nums[j] * nums[j];
                    ++j;
                } else if (j == n) {
                    ans[index] = nums[i] * nums[i];
                    --i;
                } else if (nums[i] * nums[i] < nums[j] * nums[j]) {
                    ans[index] = nums[i] * nums[i];
                    --i;
                } else {
                    ans[index] = nums[j] * nums[j];
                    ++j;
                }
                ++index;
            }

            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}