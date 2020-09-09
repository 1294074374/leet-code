package leetcode.editor.cn;
//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 示例 1: 
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
// 
//
// 示例 2: 
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
// 
// Related Topics 数组 
// 👍 536 👎 0

/**
 * Java：加一
 *
 * @author laijunlin
 * @data 2020-09-08 15:54:01
 */
public class Problem_66_加一 {
    public static void main(String[] args) {
        Solution solution = new Problem_66_加一().new Solution();
        // TO TEST
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] plusOne(int[] digits) {
            String num = "";
            for (int i = 0; i < digits.length; i++) {
                num += digits[i];
            }
            Integer temp = Integer.valueOf(num) + 1;
            num = "" + temp;
            char[] chars = num.toCharArray();
            int[] result = {};
            for (int i = 0; i < chars.length; i++) {
                result[i] = Integer.valueOf(chars[i]);
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


