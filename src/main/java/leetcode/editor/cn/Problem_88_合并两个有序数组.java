package leetcode.editor.cn;
/**
 * //给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * //
 * //
 * //
 * // 说明:
 * //
 * //
 * // 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * // 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * //
 * //
 * //
 * //
 * // 示例:
 * //
 * // 输入:
 * //nums1 = [1,2,3,0,0,0], m = 3
 * //nums2 = [2,5,6],       n = 3
 * //
 * //输出: [1,2,2,3,5,6]
 * // Related Topics 数组 双指针
 * // 👍 610 👎 0
 */

import java.util.Arrays;

/**
 * Java：合并两个有序数组 
 *
 * @author ${USER}
 * @date ${YEAR}-${MONTH}-${DAY} ${TIME}
 *
 */
public class Problem_88_合并两个有序数组 {
    public static void main(String[] args) {
        Solution solution = new Problem_88_合并两个有序数组().new Solution();
        // TO TEST
       int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        solution.merge(nums1,3,nums2,3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            System.arraycopy(nums2, 0, nums1, m, n);
            Arrays.sort(nums1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


