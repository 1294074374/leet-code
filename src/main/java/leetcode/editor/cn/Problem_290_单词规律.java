package leetcode.editor.cn;
//给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。 
//
// 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。 
//
// 示例1: 
//
// 输入: pattern = "abba", str = "dog cat cat dog"
//输出: true 
//
// 示例 2: 
//
// 输入:pattern = "abba", str = "dog cat cat fish"
//输出: false 
//
// 示例 3: 
//
// 输入: pattern = "aaaa", str = "dog cat cat dog"
//输出: false 
//
// 示例 4: 
//
// 输入: pattern = "abba", str = "dog dog dog dog"
//输出: false 
//
// 说明: 
//你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。 
// Related Topics 哈希表 
// 👍 203 👎 0

import java.util.HashMap;
import java.util.Map;

/**
 * Java：单词规律
 *
 * @author laijunlin
 * @data 2020-10-22 09:59:48
 */
public class Problem_290_单词规律 {
    public static void main(String[] args) {
        Solution solution = new Problem_290_单词规律().new Solution();
        // TO TEST
        System.out.println((int)('a'));
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        char format = 'a';
        public boolean wordPattern(String pattern, String s) {
            String[] array =   s.split(" ");
            String result = "";
            Map<String,String> map = new HashMap<>();
            for (int i = 0; i < array.length; i++) {
                if(map.get(array[i])==null){
                    map.put(array[i],String.valueOf(format));
                    result += String.valueOf(format);
                    format = (char)((int)(format)+1);
                }else{

                    result += map.get(array[i]);
                }
            }
            return result.equals(pattern);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


