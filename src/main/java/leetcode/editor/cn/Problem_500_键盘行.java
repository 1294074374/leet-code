package leetcode.editor.cn;
//给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。 
//
// 
//
// 
//
// 
//
// 示例： 
//
// 输入: ["Hello", "Alaska", "Dad", "Peace"]
//输出: ["Alaska", "Dad"]
// 
//
// 
//
// 注意： 
//
// 
// 你可以重复使用键盘上同一字符。 
// 你可以假设输入的字符串将只包含字母。 
// Related Topics 哈希表 
// 👍 113 👎 0

import java.util.Arrays;
import java.util.HashMap;

/**
 * Java：键盘行
 *
 * @author laijunlin
 * @data 2020-11-04 11:13:57
 */
public class Problem_500_键盘行 {
    public static void main(String[] args) {
        Solution solution = new Problem_500_键盘行().new Solution();
        // TO TEST
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] findWords(String[] words) {
            HashMap<Character, Integer> map = getMap();
            String[] res = new String[words.length];
            int index = 0;
            for (String word : words) {
                int tmp = 0;
                int len = word.length();
                for (int i = 0; i < len; i++) {
                    char c = word.charAt(i);
                    if (c >= 97) {
                        //小写字母转大写
                        c = (char) (c - 32);
                    }
                    int line = map.get(c);
                    if (tmp != 0 && line != tmp) break;
                    tmp = line;
                    if (i == len - 1) res[index++] = word;
                }
            }
            return Arrays.copyOf(res, index);
        }

        public HashMap getMap() {
            HashMap<Character, Integer> map = new HashMap();
            //第一行
            map.put('Q', 1);
            map.put('W', 1);
            map.put('E', 1);
            map.put('R', 1);
            map.put('T', 1);
            map.put('Y', 1);
            map.put('U', 1);
            map.put('I', 1);
            map.put('O', 1);
            map.put('P', 1);
            //第二行
            map.put('A', 2);
            map.put('S', 2);
            map.put('D', 2);
            map.put('F', 2);
            map.put('G', 2);
            map.put('H', 2);
            map.put('J', 2);
            map.put('K', 2);
            map.put('L', 2);
            //第三行
            map.put('Z', 3);
            map.put('X', 3);
            map.put('C', 3);
            map.put('V', 3);
            map.put('B', 3);
            map.put('N', 3);
            map.put('M', 3);
            return map;

        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}


