package leetcode.editor.cn;
//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表 
// 👍 1261 👎 0

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Java：合并两个有序链表
 *
 * @author laijunlin
 * @data 2020-09-15 11:03:55
 */
public class Problem_21_合并两个有序链表 {
    public static void main(String[] args) {
        Solution solution = new Problem_21_合并两个有序链表().new Solution();
        // TO TEST
        ListNode list1 = Utils.createList(new int[]{1, 2, 4});
        ListNode list2 = Utils.createList(new int[]{1, 3, 4});
        System.out.println(solution.mergeTwoLists(list1, list2));
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
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            List<Integer> list = new ArrayList<>();
            while (l1 != null) {
                list.add(l1.val);
                l1 = l1.next;
            }
            while (l2 != null) {
                list.add(l2.val);
                l2 = l2.next;
            }
            Collections.sort(list);
            ListNode head = new ListNode(-1);
            ListNode result = head;
            for (int i = 0; i < list.size(); i++) {
                ListNode temp = new ListNode(list.get(i));
                head.next = temp;
                head = head.next;
            }
            return result.next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}


