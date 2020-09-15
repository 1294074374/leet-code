package leetcode.editor.cn;
//给定一个Excel表格中的列名称，返回其相应的列序号。 
//
// 例如， 
//
//     A -> 1
//    B -> 2
//    C -> 3
//    ...
//    Z -> 26
//    AA -> 27
//    AB -> 28 
//    ...
// 
//
// 示例 1: 
//
// 输入: "A"
//输出: 1
// 
//
// 示例 2: 
//
// 输入: "AB"
//输出: 28
// 
//
// 示例 3: 
//
// 输入: "ZY"
//输出: 701 
//
// 致谢： 
//特别感谢 @ts 添加此问题并创建所有测试用例。 
// Related Topics 数学 
// 👍 172 👎 0

import java.util.HashMap;
import java.util.Map;

/**
 * Java：Excel表列序号
 *
 * @author laijunlin
 * @data 2020-09-11 13:53:06
 */
public class Problem_171_Excel表列序号 {
    public static void main(String[] args) {
        Solution solution = new Problem_171_Excel表列序号().new Solution();
        // TO TEST
        System.out.println(solution.titleToNumber("ZY"));
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int titleToNumber(String s) {
            int result = 0;
            int j  = 0;
            for (int i = s.length()-1; i >=0; i--) {
                int temp = s.charAt(i) - 64;
                result = result+(int) (Math.pow(26,j)*temp);
                j++;
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


