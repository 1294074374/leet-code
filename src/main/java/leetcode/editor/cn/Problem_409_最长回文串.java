package leetcode.editor.cn;
//给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。 
//
// 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。 
//
// 注意: 
//假设字符串的长度不会超过 1010。 
//
// 示例 1: 
//
// 
//输入:
//"abccccdd"
//
//输出:
//7
//
//解释:
//我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
// 
// Related Topics 哈希表 
// 👍 240 👎 0

import java.util.HashMap;
import java.util.Map;

/**
 * Java：最长回文串 
 
 * @author laijunlin
 * @data 2020-10-27 14:39:39
 */
public class Problem_409_最长回文串{
    public static void main(String[] args) {
        Solution solution = new Problem_409_最长回文串().new Solution();
        // TO TEST
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public int longestPalindrome(String s) {
            int[] count = new int[128];
            int length = s.length();
            for (int i = 0; i < length; ++i) {
                char c = s.charAt(i);
                count[c]++;
            }

            int ans = 0;
            for (int v: count) {
                ans += v / 2 * 2;
                if (v % 2 == 1 && ans % 2 == 0) {
                    ans++;
                }
            }
            return ans;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}


