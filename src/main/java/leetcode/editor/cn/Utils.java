package leetcode.editor.cn;

/**
 * @author laijunlin
 * @date 2020-09-10 11:32
 */
public class Utils {
    /**
     * 构建二叉树
     *
     * @param array
     * @return
     */
    public static TreeNode createTree(String[] array, int index) {
        TreeNode tn = null;
        if (index < array.length) {
            String value = array[index];
            tn = new TreeNode(Integer.valueOf(value));
            if (index * 2 + 2 <= array.length) {
                if (array[2 * index + 1] != null) {
                    tn.left = createTree(array, 2 * index + 1);
                }
                if (array[2 * index + 2] != null) {
                    tn.right = createTree(array, 2 * index + 2);
                }
            }
            return tn;
        }
        return tn;
    }

    public static ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(-1);
        for (int i = 0; i < arr.length; i++) {
            ListNode treeNode = new ListNode(arr[i]);
            head.next = treeNode;
        }
        return head.next;
    }

}
