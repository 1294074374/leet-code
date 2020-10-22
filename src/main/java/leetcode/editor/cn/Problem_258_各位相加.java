package leetcode.editor.cn;
//给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。 
//
// 示例: 
//
// 输入: 38
//输出: 2 
//解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
// 
//
// 进阶: 
//你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？ 
// Related Topics 数学 
// 👍 292 👎 0

/**
 * Java：各位相加 
 
 * @author laijunlin
 * @data 2020-10-21 09:52:01
 */
public class Problem_258_各位相加{
    public static void main(String[] args) {
        Solution solution = new Problem_258_各位相加().new Solution();
        // TO TEST
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private final int FLAG = 10;
    public int addDigits(int num) {
        String stringNum = String.valueOf(num);
        while(Integer.valueOf(stringNum)>=FLAG){
            int temp = 0;
            for (int i = 0; i < stringNum.length(); i++) {
                temp+=Integer.valueOf(String.valueOf(stringNum.charAt(i)));
            }
            stringNum = String.valueOf(temp);
        }
        return Integer.valueOf(stringNum);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


