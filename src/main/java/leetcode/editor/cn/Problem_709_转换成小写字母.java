package leetcode.editor.cn;
//实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入: "Hello"
//输出: "hello" 
//
// 示例 2： 
//
// 
//输入: "here"
//输出: "here" 
//
// 示例 3： 
//
// 
//输入: "LOVELY"
//输出: "lovely"
// 
// Related Topics 字符串 
// 👍 139 👎 0

/**
 * Java：转换成小写字母 
 
 * @author laijunlin
 * @data 2021-01-04 15:11:39
 */
public class Problem_709_转换成小写字母{
    public static void main(String[] args) {
        Solution solution = new Problem_709_转换成小写字母().new Solution();
        // TO TEST
        System.out.println((int)'a');
        System.out.println((int)'Z');
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String toLowerCase(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);
            if(t>=65 && t<=90){
                stringBuffer.append((char)(t+32)+"");
            }else{
                stringBuffer.append(t+"");
            }
        }
        return stringBuffer.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


