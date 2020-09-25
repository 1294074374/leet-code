package leetcode.editor.cn;
//统计所有小于非负整数 n 的质数的数量。 
//
// 示例: 
//
// 输入: 10
//输出: 4
//解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
// 
// Related Topics 哈希表 数学 
// 👍 434 👎 0

/**
 * Java：计数质数
 *
 * @author laijunlin
 * @data 2020-09-23 15:51:09
 */
public class Problem_204_计数质数 {
    public static void main(String[] args) {
        Solution solution = new Problem_204_计数质数().new Solution();
        // TO TEST
        int i = solution.countPrimes(11);
        System.out.println(i);
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countPrimes(int n) {
            int result = 0;
            boolean[] b = new boolean[n];   // 初始化默认值都为 false，为质数标记
            if(2 < n) result++; // 如果大于 2 则一定拥有 2 这个质数

            for(int i = 3; i < n; i += 2){  // 从 3 开始遍历，且只遍历奇数
                if(!b[i]){  // 是质数
                    for(int j = 3; i * j < n; j += 2){
                        b[i * j] = true;    // 将当前质数的奇数倍都设置成非质数标记 true
                    }
                    result++;   // 质数个数 +1
                }
            }
            return result;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)




