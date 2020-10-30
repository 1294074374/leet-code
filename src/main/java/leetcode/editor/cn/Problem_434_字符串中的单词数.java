package leetcode.editor.cn;
//统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。 
//
// 请注意，你可以假定字符串里不包括任何不可打印的字符。 
//
// 示例: 
//
// 输入: "Hello, my name is John"
//输出: 5
//解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
// 
// Related Topics 字符串 
// 👍 60 👎 0

/**
 * Java：字符串中的单词数 
 
 * @author laijunlin
 * @data 2020-10-28 11:03:04
 */
public class Problem_434_字符串中的单词数{
    public static void main(String[] args) {
        Solution solution = new Problem_434_字符串中的单词数().new Solution();
        // TO TEST
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countSegments(String s) {
        String[] s1 = s.split(" ");
        int result = 0;
        for (int i = 0; i < s1.length; i++) {
            if(!"".equals(s1[i])){
                result++;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


