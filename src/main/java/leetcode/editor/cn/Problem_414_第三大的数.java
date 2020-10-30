package leetcode.editor.cn;
//给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。 
//
// 示例 1: 
//
// 
//输入: [3, 2, 1]
//
//输出: 1
//
//解释: 第三大的数是 1.
// 
//
// 示例 2: 
//
// 
//输入: [1, 2]
//
//输出: 2
//
//解释: 第三大的数不存在, 所以返回最大的数 2 .
// 
//
// 示例 3: 
//
// 
//输入: [2, 2, 3, 1]
//
//输出: 1
//
//解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
//存在两个值为2的数，它们都排第二。
// 
// Related Topics 数组 
// 👍 175 👎 0

import java.util.Arrays;

/**
 * Java：第三大的数
 *
 * @author laijunlin
 * @data 2020-10-27 16:57:13
 */
public class Problem_414_第三大的数 {
    public static void main(String[] args) {
        Solution solution = new Problem_414_第三大的数().new Solution();
        // TO TEST
        int[] arr  = {2,3,1};
        System.out.println(solution.thirdMax(arr));
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int thirdMax(int[] nums) {
            Arrays.sort(nums); //对数组进行升序排序
            int index = 1;//定义变量保存从最后数，第三大的值
            for(int j = nums.length - 1; j > 0; j--){
                if(nums[j] != nums[j-1]) {//当最后一个元素不等于倒数第二个元素时，执行++操作，否则继续判断倒数第二个与倒数第三个比，以此类推，当index为3时，则找到了
                    index++;
                }
                if(index == 3){
                    return nums[j-1];
                }
            }

            return nums[nums.length-1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


