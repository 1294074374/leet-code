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
     * @param index 当前节点下标 初始值为0
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

    /**
     * 创建链表
     *
     * @param arr 原始数组
     * @return 新链表的头部结点
     */
    public static ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(-1);
        ListNode result = head;
        for (int i = 0; i < arr.length; i++) {
            ListNode treeNode = new ListNode(arr[i]);
            head.next = treeNode;
            head = head.next;
        }
        return result.next;
    }

    /**
     * 打印链表
     *
     * @param node 需要打印链表的头部结点
     */
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + ",");
            node = node.next;
        }
    }

    /***
     * 打印二维数组
     * @param array 需要打印的二维数组
     */
    public static void print2DArray(int[][] array) {
        StringBuffer sb = new StringBuffer();
        int n = array.length;
        int m = array[0].length;
        for (int i = 0; i < n; i++) {
            sb.append("[");
            for (int j = 0; j < m; j++) {
                if (j != m - 1) {
                    sb.append(array[i][j] + ", ");
                } else {
                    sb.append(array[i][j]);
                }
            }
            sb.append("]\n");
        }
        System.out.println(sb.toString());
    }
}
