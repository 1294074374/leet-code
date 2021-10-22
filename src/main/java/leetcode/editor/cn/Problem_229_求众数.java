package leetcode.editor.cn;

import java.util.*;

/**
 * Java：求众数
 *
 * @author laijunlin
 * @data 2020-10-21 10:42:52
 */
public class Problem_229_求众数 {
    public static void main(String[] args) {
        Solution solution = new Problem_229_求众数().new Solution();

    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> majorityElement(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int n : nums) {
                if (map.get(n) == null) {
                    map.put(n, 1);
                } else {
                    map.put(n, map.get(n) + 1);
                }
            }
            List<Integer> list = new ArrayList<>();
            Set<Integer> set = map.keySet();
            for (int n:set                 ) {
                if(map.get(n) > nums.length/3){
                    list.add(n);
                }
            }
            return list;
        }
    }


//leetcode submit region end(Prohibit modification and deletion)

}


