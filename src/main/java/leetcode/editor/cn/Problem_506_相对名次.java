package leetcode.editor.cn;
//给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold Medal",
// "Silver Medal", "Bronze Medal"）。 
//
// (注：分数越高的选手，排名越靠前。) 
//
// 示例 1: 
//
// 
//输入: [5, 4, 3, 2, 1]
//输出: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
//解释: 前三名运动员的成绩为前三高的，因此将会分别被授予 “金牌”，“银牌”和“铜牌” ("Gold Medal", "Silver Medal" and 
//"Bronze Medal").
//余下的两名运动员，我们只需要通过他们的成绩计算将其相对名次即可。 
//
// 提示: 
//
// 
// N 是一个正整数并且不会超过 10000。 
// 所有运动员的成绩都不相同。 
// 
// 👍 62 👎 0

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Java：相对名次 
 
 * @author laijunlin
 * @data 2020-11-04 13:16:29
 */
public class Problem_506_相对名次{
    public static void main(String[] args) {
        Solution solution = new Problem_506_相对名次().new Solution();
        // TO TEST
        solution.findRelativeRanks(new int[]{10,3,8,9,4});
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[] sort = new int[nums.length];
        for (int i = 0; i < sort.length; i++) {
            sort[i] = nums[i];
        }
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(sort);
        int j = 1;
        for (int i = sort.length -1; i >= 0; i--) {
            if(map.get(sort[i])==null){
                map.put(sort[i],j);
                j++;
            }
        }
        String [] result = new String[sort.length];
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == 1){
                result[i] = "Gold Medal";
            }else if(map.get(nums[i]) == 2){
                result[i] = "Silver Medal";
            }else if(map.get(nums[i]) == 3){
                result[i] = "Bronze Medal";
            }else{
                result[i] = ""+map.get(nums[i]);
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


