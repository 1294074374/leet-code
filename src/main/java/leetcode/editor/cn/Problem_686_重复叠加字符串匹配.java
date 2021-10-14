package leetcode.editor.cn;
//给定两个字符串 a 和 b，寻找重复叠加字符串 a 的最小次数，使得字符串 b 成为叠加后的字符串 a 的子串，如果不存在则返回 -1。 
//
// 注意：字符串 "abc" 重复叠加 0 次是 ""，重复叠加 1 次是 "abc"，重复叠加 2 次是 "abcabc"。 
//
// 
//
// 示例 1： 
//
// 输入：a = "abcd", b = "cdabcdab"
//输出：3
//解释：a 重复叠加三遍后为 "abcdabcdabcd", 此时 b 是其子串。
// 
//
// 示例 2： 
//
// 输入：a = "a", b = "aa"
//输出：2
// 
//
// 示例 3： 
//
// 输入：a = "a", b = "a"
//输出：1
// 
//
// 示例 4： 
//
// 输入：a = "abc", b = "wxyz"
//输出：-1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= a.length <= 10⁴ 
// 1 <= b.length <= 10⁴ 
// a 和 b 由小写英文字母组成 
// 
// Related Topics 字符串 字符串匹配 👍 151 👎 0


/**
 * Java：重复叠加字符串匹配
 *
 * @author laijunlin
 * @data 2021-10-14 14:03:55
 */
public class Problem_686_重复叠加字符串匹配 {
    public static void main(String[] args) {
        Solution solution = new Problem_686_重复叠加字符串匹配().new Solution();
        solution.repeatedStringMatch("abcd", "cdabcdab");
    }

    /**
     * leetcode submit region begin(Prohibit modification and deletion)
     */
    class Solution {
        public int repeatedStringMatch(String a, String b) {
            if (a == null || b == null) {
                return -1;
            }
            char[] chars = b.toCharArray();
            for (char c : chars) {
                if(!a.contains(String.valueOf(c))){
                    return -1;
                }
            }
            StringBuffer sb = new StringBuffer();
            int count = 0;
            while (sb.toString().length() <= b.length() || count < 10) {
                sb.append(a);
                count++;
                if (sb.toString().contains(b)) {
                    return count;
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}