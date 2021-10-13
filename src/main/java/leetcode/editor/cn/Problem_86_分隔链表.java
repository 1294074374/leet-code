package leetcode.editor.cn;
//给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。 
//
// 你应当 保留 两个分区中每个节点的初始相对位置。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,4,3,2,5,2], x = 3
//输出：[1,2,2,4,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [2,1], x = 2
//输出：[1,2]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 200] 内 
// -100 <= Node.val <= 100 
// -200 <= x <= 200 
// 
// Related Topics 链表 双指针 👍 462 👎 0


/**
 * Java：分隔链表
 *
 * @author laijunlin
 * @data 2021-10-13 15:12:43
 */
public class Problem_86_分隔链表 {
    public static void main(String[] args) {
        Solution solution = new Problem_86_分隔链表().new Solution();
        ListNode list = Utils.createList(new int[]{1, 4, 3, 2, 5, 2});
        ListNode partition = solution.partition(list, 3);
        Utils.printList(partition);
    }
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
        public ListNode partition(ListNode head, int x) {
            ListNode minListNode = new ListNode(-1);
            ListNode maxListNode = new ListNode(-1);
            ListNode minListNodeHead = minListNode;
            ListNode maxListNodeHead = maxListNode;
            while (head != null) {
                int var = head.val;
                if (var < x) {
                    ListNode node = new ListNode(var);
                    minListNode.next = node;
                    minListNode = minListNode.next;
                } else {
                    ListNode node = new ListNode(var);
                    maxListNode.next = node;
                    maxListNode = maxListNode.next;
                }
                // 指针后移
                head = head.next;
            }
            minListNode.next = maxListNodeHead.next;
            return minListNodeHead.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}