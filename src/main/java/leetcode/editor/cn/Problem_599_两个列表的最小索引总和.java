package leetcode.editor.cn;
//假设Andy和Doris想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。 
//
// 你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设总是存在一个答案。 
//
// 示例 1: 
//
// 输入:
//["Shogun", "Tapioca Express", "Burger King", "KFC"]
//["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
//输出: ["Shogun"]
//解释: 他们唯一共同喜爱的餐厅是“Shogun”。
// 
//
// 示例 2: 
//
// 输入:
//["Shogun", "Tapioca Express", "Burger King", "KFC"]
//["KFC", "Shogun", "Burger King"]
//输出: ["Shogun"]
//解释: 他们共同喜爱且具有最小索引和的餐厅是“Shogun”，它有最小的索引和1(0+1)。
// 
//
// 提示: 
//
// 
// 两个列表的长度范围都在 [1, 1000]内。 
// 两个列表中的字符串的长度将在[1，30]的范围内。 
// 下标从0开始，到列表的长度减1。 
// 两个列表都没有重复的元素。 
// 
// Related Topics 哈希表 
// 👍 88 👎 0

import java.util.Stack;

/**
 * Java：两个列表的最小索引总和
 *
 * @author laijunlin
 * @data 2020-11-14 16:13:46
 */
public class Problem_599_两个列表的最小索引总和 {
    public static void main(String[] args) {
        Solution solution = new Problem_599_两个列表的最小索引总和().new Solution();
        // TO TEST
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        solution.findRestaurant(list1,list2);
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            int a = list1.length;
            int b = list2.length;
            int minIndex = Integer.MAX_VALUE;
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (list1[i].equals(list2[j])) {
                        int min = i + j;
                        if (min < minIndex) {
                            minIndex = min;
                            while (!stack.isEmpty()) {
                                stack.pop();
                            }
                            stack.push(list1[i]);
                        }else if(min == minIndex){
                            stack.push(list1[i]);
                        }

                    }
                }
            }
            String[] result = new String[stack.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = stack.pop();
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


