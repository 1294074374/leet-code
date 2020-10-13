package leetcode.editor.cn;
//给定两个字符串 s 和 t，判断它们是否是同构的。 
//
// 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。 
//
// 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。 
//
// 示例 1: 
//
// 输入: s = "egg", t = "add"
//输出: true
// 
//
// 示例 2: 
//
// 输入: s = "foo", t = "bar"
//输出: false 
//
// 示例 3: 
//
// 输入: s = "paper", t = "title"
//输出: true 
//
// 说明: 
//你可以假设 s 和 t 具有相同的长度。 
// Related Topics 哈希表 
// 👍 250 👎 0

import java.util.HashMap;

/**
 * Java：同构字符串
 *
 * @author laijunlin
 * @data 2020-10-13 16:02:02
 */
public class Problem_205_同构字符串 {
    public static void main(String[] args) {
        Solution solution = new Problem_205_同构字符串().new Solution();
        // TO TEST
        solution.isIsomorphic("egg","abb");
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            HashMap<String, Integer> sMap = new HashMap<>();
            HashMap<String, Integer> tMap = new HashMap<>();

            String sResult = "";
            String tResult = "";

            int n = 0;
            int m = 0;

            for (int i = 0; i < s.length(); i++) {
                if (sMap.get(String.valueOf(s.charAt(i))) == null) {
                    sResult += n;
                    sMap.put(String.valueOf(s.charAt(i)), n);
                    n++;
                } else {
                    sResult += sMap.get(String.valueOf(s.charAt(i)));
                }
                if (tMap.get(String.valueOf(t.charAt(i))) == null) {
                    tResult += m;
                    tMap.put(String.valueOf(t.charAt(i)), m);
                    m++;
                } else {
                    tResult += tMap.get(String.valueOf(t.charAt(i)));
                }
            }

            return sResult.equals(tResult);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


