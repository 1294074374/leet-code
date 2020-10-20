package leetcode.editor.cn;
//请判断一个链表是否为回文链表。 
//
// 示例 1: 
//
// 输入: 1->2
//输出: false 
//
// 示例 2: 
//
// 输入: 1->2->2->1
//输出: true
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 链表 双指针 
// 👍 669 👎 0

import java.util.ArrayList;
import java.util.List;

/**
 * Java：回文链表
 *
 * @author laijunlin
 * @data 2020-10-20 14:01:39
 */
public class Problem_234_回文链表 {
    public static void main(String[] args) {
        Solution solution = new Problem_234_回文链表().new Solution();
        // TO TEST
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null){
                return true;
            }
            List<Integer> vals = new ArrayList<>();
            while (head != null) {
                vals.add( head.val);
                head = head.next;
            }
            int start = 0;
            int end = vals.size() - 1;
            while (start < end) {
                if (!vals.get(start).equals(vals.get(end))) {
                    return false;
                }
                start++;
                end--;
            }

            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


