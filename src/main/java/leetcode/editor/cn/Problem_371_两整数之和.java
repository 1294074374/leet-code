package leetcode.editor.cn;
//不使用运算符 + 和 - ，计算两整数 a 、b 之和。 
//
// 示例 1: 
//
// 输入: a = 1, b = 2
//输出: 3
// 
//
// 示例 2: 
//
// 输入: a = -2, b = 3
//输出: 1 
// Related Topics 位运算 
// 👍 322 👎 0

/**
 * Java：两整数之和 
 
 * @author laijunlin
 * @data 2020-10-23 10:08:52
 */
public class Problem_371_两整数之和{
    public static void main(String[] args) {
        Solution solution = new Problem_371_两整数之和().new Solution();
        // TO TEST
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int getSum(int a, int b) {
        int res=a;
        int xor=a^b;//得到原位和
        int forward=(a&b)<<1;//得到进位和
        if(forward!=0){//若进位和不为0，则递归求原位和+进位和
            res=getSum(xor, forward);
        }else{
            res=xor;//若进位和为0，则此时原位和为所求和
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


