package leetcode.editor.cn;
//给定一个正整数，返回它在 Excel 表中相对应的列名称。 
//
// 例如， 
//
//     1 -> A
//    2 -> B
//    3 -> C
//    ...
//    26 -> Z
//    27 -> AA
//    28 -> AB 
//    ...
// 
//
// 示例 1: 
//
// 输入: 1
//输出: "A"
// 
//
// 示例 2: 
//
// 输入: 28
//输出: "AB"
// 
//
// 示例 3: 
//
// 输入: 701
//输出: "ZY"
// 
// Related Topics 数学 
// 👍 265 👎 0

/**
 * Java：Excel表列名称 
 
 * @author laijunlin
 * @data 2020-09-15 11:37:49
 */
public class Problem_168_Excel表列名称{
    public static void main(String[] args) {
        Solution solution = new Problem_168_Excel表列名称().new Solution();
        // TO TEST
        System.out.println(solution.convertToTitle(52));
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convertToTitle(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        if(n<26){
            char temp = (char)(n+64);
            stringBuffer.append(temp+"");
            n = n/26;
        }
        while (n>26){
            int t=n/26;
            char temp = (char)(t+64);
            stringBuffer.append(temp+"");
            n = n-26*t;
        }
        if(n>0){
            char temp = (char)(n+64);
            stringBuffer.append(temp+"");
        }
        return stringBuffer.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


