package leetcode.editor.cn;
//你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。 
//
// 给定一个数字 n，找出可形成完整阶梯行的总行数。 
//
// n 是一个非负整数，并且在32位有符号整型的范围内。 
//
// 示例 1: 
//
// 
//n = 5
//
//硬币可排列成以下几行:
//¤
//¤ ¤
//¤ ¤
//
//因为第三行不完整，所以返回2.
// 
//
// 示例 2: 
//
// 
//n = 8
//
//硬币可排列成以下几行:
//¤
//¤ ¤
//¤ ¤ ¤
//¤ ¤
//
//因为第四行不完整，所以返回3.
// 
// Related Topics 数学 二分查找 
// 👍 82 👎 0

/**
 * Java：排列硬币 
 
 * @author laijunlin
 * @data 2020-10-28 11:07:11
 */
public class Problem_441_排列硬币{
    public static void main(String[] args) {
        Solution solution = new Problem_441_排列硬币().new Solution();
        // TO TEST
        System.out.println(solution.arrangeCoins(2));
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int arrangeCoins(int n) {
        int m = n;
        int i = 0;
        if(n == 1){
            return 1;
        }
        for ( i = 0; i <= m; i++) {
            if(n-i>=0){
                n = n-i;
            }else{
                return i-1;
            }
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


