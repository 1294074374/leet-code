package leetcode.editor.cn;
//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 示例 1: 
//
// 输入: "A man, a plan, a canal: Panama"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "race a car"
//输出: false
// 
// Related Topics 双指针 字符串 
// 👍 270 👎 0

/**
 * Java：验证回文串
 *
 * @author laijunlin
 * @data 2020-09-11 09:51:11
 */
public class Problem_125_验证回文串 {
    public static void main(String[] args) {
        Solution solution = new Problem_125_验证回文串().new Solution();
        // TO TEST
        String test = "A man, a plan, a canal: Panama";
        System.out.println(solution.isPalindrome(test));
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(String s) {
            if (s == null || "".equals(s) || s.length()==1) {
                return true;
            }
            s = s.replaceAll("[^0-9a-zA-Z]","");
            s = s.toLowerCase();
            int i = 0;
            int j = s.length() - 1;
            while (i != j && i < j) {
                char start = s.charAt(i);
                char end = s.charAt(j);
                if (start != end) {
                    return false;
                } else {
                    i++;
                    j--;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


