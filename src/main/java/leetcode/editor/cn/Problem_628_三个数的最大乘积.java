package leetcode.editor.cn;
//给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。 
//
// 示例 1: 
//
// 
//输入: [1,2,3]
//输出: 6
// 
//
// 示例 2: 
//
// 
//输入: [1,2,3,4]
//输出: 24
// 
//
// 注意: 
//
// 
// 给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。 
// 输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。 
// 
// Related Topics 数组 数学 
// 👍 198 👎 0

import java.util.Arrays;

/**
 * Java：三个数的最大乘积
 *
 * @author laijunlin
 * @data 2020-12-11 11:16:36
 */
public class Problem_628_三个数的最大乘积 {
    public static void main(String[] args) {
        Solution solution = new Problem_628_三个数的最大乘积().new Solution();
        // TO TEST
        System.out.println(solution.maximumProduct(new int[]{-9,-1,1,2,3}));
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maximumProduct(int[] nums) {
            Arrays.sort(nums);
            int l = nums.length - 1;
            int a = nums[l] * nums[l - 1] * nums[l - 2];
            int b = nums[l] * nums[0] * nums[1];
            return a > b ? a : b;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


