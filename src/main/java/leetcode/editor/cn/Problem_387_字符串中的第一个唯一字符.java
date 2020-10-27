package leetcode.editor.cn;
//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。 
//
// 
//
// 示例： 
//
// s = "leetcode"
//返回 0
//
//s = "loveleetcode"
//返回 2
// 
//
// 
//
// 提示：你可以假定该字符串只包含小写字母。 
// Related Topics 哈希表 字符串 
// 👍 281 👎 0

import java.util.HashMap;
import java.util.Map;

/**
 * Java：字符串中的第一个唯一字符 
 
 * @author laijunlin
 * @data 2020-10-26 14:27:37
 */
public class Problem_387_字符串中的第一个唯一字符{
    public static void main(String[] args) {
        Solution solution = new Problem_387_字符串中的第一个唯一字符().new Solution();
        // TO TEST
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstUniqChar(String s) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String temp = String.valueOf(s.charAt(i));
            if(map.get(temp) == null){
                map.put(temp,1);
            }else{
                int t=map.get(temp);
                map.put(temp,(++t));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            String temp = String.valueOf(s.charAt(i));
            if(map.get(temp) == 1){
                return i;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


