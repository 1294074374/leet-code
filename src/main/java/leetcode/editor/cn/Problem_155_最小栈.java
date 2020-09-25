package leetcode.editor.cn;
//设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。 
//
// 
// push(x) —— 将元素 x 推入栈中。 
// pop() —— 删除栈顶的元素。 
// top() —— 获取栈顶元素。 
// getMin() —— 检索栈中的最小元素。 
// 
//
// 
//
// 示例: 
//
// 输入：
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//输出：
//[null,null,null,null,-3,null,0,-2]
//
//解释：
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
// 
//
// 
//
// 提示： 
//
// 
// pop、top 和 getMin 操作总是在 非空栈 上调用。 
// 
// Related Topics 栈 设计 
// 👍 656 👎 0

import java.util.Stack;

/**
 * Java：最小栈
 *
 * @author laijunlin
 * @data 2020-09-08 14:57:20
 */
public class Problem_155_最小栈 {
    public static void main(String[] args) {
        MinStack solution = new Problem_155_最小栈().new MinStack();
        // TO TEST
        solution.push(1);
        solution.push(2);
        solution.push(-52);
        solution.push(-3);
        System.out.println(solution.getMin());
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class MinStack {
        private Stack<Integer> inStack = new Stack<>();
        private Stack<Integer> outStack = new Stack<>();

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            outStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            outStack.push(Math.min(x, outStack.pop()));
            inStack.push(x);
        }

        public void pop() {
            inStack.pop();
            outStack.pop();
        }

        public int top() {
            return inStack.peek();
        }

        public int getMin() {
            return outStack.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

}


