package leetcode.editor.cn;
//给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。 
//
// 
//
// 示例： 
//
// 输入："Let's take LeetCode contest"
//输出："s'teL ekat edoCteeL tsetnoc"
// 
//
// 
//
// 提示： 
//
// 
// 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。 
// 
// Related Topics 双指针 字符串 👍 344 👎 0


/**
 * Java：反转字符串中的单词 III
 *
 * @author laijunlin
 * @data 2021-10-22 20:29:21
 */
public class Problem_557_反转字符串中的单词_III {
    public static void main(String[] args) {
        Solution solution = new Problem_557_反转字符串中的单词_III().new Solution();
		System.out.println(solution.reverseWords("Let's take LeetCode contest"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseWords(String s) {
            String[] strArr = s.split(" ");
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < strArr.length; i++) {
                if (i != strArr.length - 1) {
                    sb.append(reverseString(strArr[i]))
                            .append(" ");
                } else {
                    sb.append(reverseString(strArr[i]));
                }
            }
            return sb.toString();
        }

        public String reverseString(String str) {
            char[] s = str.toCharArray();
            int i = 0;
            int j = s.length - 1;
            while (i < j) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            }
            return String.valueOf(s);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}