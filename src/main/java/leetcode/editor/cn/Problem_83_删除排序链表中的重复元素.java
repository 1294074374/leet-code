package leetcode.editor.cn;
/**
 * //给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。 
//
// 示例 1: 
//
// 输入: 1->1->2
//输出: 1->2
// 
//
// 示例 2: 
//
// 输入: 1->1->2->3->3
//输出: 1->2->3 
// Related Topics 链表 
// 👍 389 👎 0

 */
/**
 * Java：删除排序链表中的重复元素 
 *
 * @author ${USER}
 * @date ${YEAR}-${MONTH}-${DAY} ${TIME}
 *
 */
public class Problem_83_删除排序链表中的重复元素{
    public static void main(String[] args) {
        Solution solution = new Problem_83_删除排序链表中的重复元素().new Solution();
        // TO TEST
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        solution.deleteDuplicates(node1);
        System.out.println(1);

    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = new ListNode(-1);
        result.next = head;
        while(head != null && head.next !=null){
            if(head.val == head.next.val){
                ListNode temp = head.next;
                head.next = temp.next;
                continue;
            }
            head = head.next;
        }
        return result.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


