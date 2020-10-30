package leetcode.editor.cn;
//给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。 
//
// 示例 1: 
//
// 
//输入: "abab"
//
//输出: True
//
//解释: 可由子字符串 "ab" 重复两次构成。
// 
//
// 示例 2: 
//
// 
//输入: "aba"
//
//输出: False
// 
//
// 示例 3: 
//
// 
//输入: "abcabcabcabc"
//
//输出: True
//
//解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
// 
// Related Topics 字符串 
// 👍 391 👎 0

/**
 * Java：重复的子字符串
 *
 * @author laijunlin
 * @data 2020-10-30 12:34:02
 */
public class Problem_459_重复的子字符串 {
    public static void main(String[] args) {
        Solution solution = new Problem_459_重复的子字符串().new Solution();
        // TO TEST
        System.out.println(solution.repeatedSubstringPattern("aba"));
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            int n = s.length();
            for (int i = 1; i * 2 <= n; ++i) {
                if (n % i == 0) {
                    boolean match = true;
                    for (int j = i; j < n; ++j) {
                        if (s.charAt(j) != s.charAt(j - i)) {
                            match = false;
                            break;
                        }
                    }
                    if (match) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


