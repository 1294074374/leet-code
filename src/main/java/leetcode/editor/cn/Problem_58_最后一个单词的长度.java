package leetcode.editor.cn;
//给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。 
//
// 如果不存在最后一个单词，请返回 0 。 
//
// 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。 
//
// 
//
// 示例: 
//
// 输入: "Hello World"
//输出: 5
// 
// Related Topics 字符串 
// 👍 239 👎 0

/**
 * Java：最后一个单词的长度
 *
 * @author laijunlin
 * @data 2020-09-09 15:53:12
 */
public class Problem_58_最后一个单词的长度 {
    public static void main(String[] args) {
        Solution solution = new Problem_58_最后一个单词的长度().new Solution();
        // TO TEST
        Integer x = 1; // 自动装箱  Integer x = Integer.valueOf(1)
        int y  = x; // 自动拆箱  int y = x.intValue();
        System.out.println(y);
        String s = "abc";
        int hash = s.hashCode();
        char[] value = s.toCharArray();
        int h = 0;
        if (h == 0 && value.length > 0) {
            char val[] = value;

            for (int i = 0; i < value.length; i++) {
                h = 31 * h + val[i];
            }
            hash = h;
        }
        System.out.println( hash);
        System.out.println((10<<5)-10);
        System.out.println(10*31);
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLastWord(String s) {
            int end = s.length() - 1;
            while (end >= 0 && s.charAt(end) == ' ') {
                end--;
            }
            if (end < 0) {
                return 0;
            }
            int start = end;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }
            return end - start;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


