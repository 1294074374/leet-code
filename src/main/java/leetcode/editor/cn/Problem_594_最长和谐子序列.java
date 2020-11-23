package leetcode.editor.cn;
//和谐数组是指一个数组里元素的最大值和最小值之间的差别正好是1。 
//
// 现在，给定一个整数数组，你需要在所有可能的子序列中找到最长的和谐子序列的长度。 
//
// 示例 1: 
//
// 
//输入: [1,3,2,2,5,2,3,7]
//输出: 5
//原因: 最长的和谐数组是：[3,2,2,2,3].
// 
//
// 说明: 输入的数组长度最大不超过20,000. 
// Related Topics 哈希表 
// 👍 131 👎 0

/**
 * Java：最长和谐子序列 
 
 * @author laijunlin
 * @data 2020-11-11 18:28:00
 */
public class Problem_594_最长和谐子序列{
    public static void main(String[] args) {
        Solution solution = new Problem_594_最长和谐子序列().new Solution();
        // TO TEST
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public int findLHS(int[] nums) {
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                int count = 0;
                boolean flag = false;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == nums[i])
                        count++;
                    else if (nums[j] + 1 == nums[i]) {
                        count++;
                        flag = true;
                    }
                }
                if (flag)
                    res = Math.max(count, res);
            }
            return res;
        } 
}
//leetcode submit region end(Prohibit modification and deletion)

}


