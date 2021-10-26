package leetcode.editor.cn;
//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
// Related Topics 链表 双指针 👍 1625 👎 0


/**
 * Java：删除链表的倒数第 N 个结点
 
 * @author laijunlin
 * @data 2021-10-26 20:33:10
 */
public class Problem_19_删除链表的倒数第N个结点{
	public static void main(String[] args) {
		Solution solution = new Problem_19_删除链表的倒数第N个结点().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
		// 获取链表长度
		int listLength = 0;
		ListNode tempNode = head;
		while (tempNode != null) {
			listLength++;
			tempNode = tempNode.next;
		}
		if(listLength ==1 && n==1) {
			return null;
		}
		if(listLength == n){
			return head.next;
		}
		// 需要删除结点的前一个结点
		int cut = listLength - n - 1;
		ListNode cupList = head;
		for (int i = 1; i <= cut; i++) {
			cupList = cupList.next;
		}
		//删除结点
		cupList.next = cupList.next.next;
		return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}