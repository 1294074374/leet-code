package leetcode.editor.cn;
//给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。 
//
// 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。 
//
// 示例 1: 
//
// 
//输入: [1, 2, 2, 3, 1]
//输出: 2
//解释: 
//输入数组的度是2，因为元素1和2的出现频数最大，均为2.
//连续子数组里面拥有相同度的有如下所示:
//[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
//最短连续子数组[2, 2]的长度为2，所以返回2.
// 
//
// 示例 2: 
//
// 
//输入: [1,2,2,3,1,4,2]
//输出: 6
// 
//
// 注意: 
//
// 
// nums.length 在1到50,000区间范围内。 
// nums[i] 是一个在0到49,999范围内的整数。 
// 
// Related Topics 数组 
// 👍 195 👎 0

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Java：数组的度
 *
 * @author laijunlin
 * @data 2020-12-27 23:36:21
 */
public class Problem_697_数组的度 {
    public static void main(String[] args) {
        Solution solution = new Problem_697_数组的度().new Solution();
        // TO TEST
        int[] arr = new int[]{1,2,2,3,1};
        solution.findShortestSubArray(arr);
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findShortestSubArray(int[] nums) {
            Map<Integer, Integer> map = new HashMap();
            for (int i = 0; i < nums.length; i++) {
                if (map.get(nums[i]) == null) {
                    map.put(nums[i], 1);
                } else {
                    Integer integer = map.get(nums[i]);
                    integer++;
                    map.put(nums[i], integer);
                }
            }
            Set<Integer> keys = map.keySet();
            int max = Integer.MIN_VALUE;
            int maxKey = Integer.MIN_VALUE;
            for (Integer key : keys) {
                if(map.get(key)>max){
                    max = map.get(key);
                    if(maxKey < key){
                        maxKey = key;
                    }

                }
            }
            Integer maxCount = map.get(maxKey);
            int j = 0;
            int k = nums.length-1;
            while(j<nums.length -1){
                if(nums[j] == maxCount){
                    break;
                }else{
                    j++;
                }
            }
            while(k>-1){
                if(nums[k] == maxCount){
                    break;
                }else{
                    k--;
                }
            }
            return k-j+1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


