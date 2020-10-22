package leetcode.editor.cn;
//编写一个函数，以字符串作为输入，反转该字符串中的元音字母。 
//
// 
//
// 示例 1： 
//
// 输入："hello"
//输出："holle"
// 
//
// 示例 2： 
//
// 输入："leetcode"
//输出："leotcede" 
//
// 
//
// 提示： 
//
// 
// 元音字母不包含字母 "y" 。 
// 
// Related Topics 双指针 字符串 
// 👍 120 👎 0

/**
 * Java：反转字符串中的元音字母
 *
 * @author laijunlin
 * @data 2020-10-22 13:31:20
 */
public class Problem_345_反转字符串中的元音字母 {
    public static void main(String[] args) {
        Solution solution = new Problem_345_反转字符串中的元音字母().new Solution();
        // TO TEST
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseVowels(String s){
            if (s == null || s.length() == 0) {
                return s;
            }
            String vowels = "aeiouAEIOU";

            // 将字符串转化成char类型数组
            char[] chars = s.toCharArray();
            int start = 0;
            int end = s.length() - 1;
            while (start < end) {
                // 双指针相向而行找元音字符
                while (start < end && !vowels.contains(chars[start] + "")) {
                    start++;
                }
                while (start < end && !vowels.contains(chars[end] + "")) {
                    end--;
                }
                swap(chars, start, end);
                start++;
                end--;
            }
            return new String(chars);

        }

        private void swap(char[] chars, int start, int end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
        }
//leetcode submit region end(Prohibit modification and deletion)

    }

}
