package leetcode.editor.cn;
//你现在是一场采特殊赛制棒球比赛的记录员。这场比赛由若干回合组成，过去几回合的得分可能会影响以后几回合的得分。 
//
// 比赛开始时，记录是空白的。你会得到一个记录操作的字符串列表 ops，其中 ops[i] 是你需要记录的第 i 项操作，ops 遵循下述规则： 
//
// 
// 整数 x - 表示本回合新获得分数 x 
// "+" - 表示本回合新获得的得分是前两次得分的总和。题目数据保证记录此操作时前面总是存在两个有效的分数。 
// "D" - 表示本回合新获得的得分是前一次得分的两倍。题目数据保证记录此操作时前面总是存在一个有效的分数。 
// "C" - 表示前一次得分无效，将其从记录中移除。题目数据保证记录此操作时前面总是存在一个有效的分数。 
// 
//
// 请你返回记录中所有得分的总和。 
//
// 
//
// 示例 1： 
//
// 
//输入：ops = ["5","2","C","D","+"]
//输出：30
//解释：
//"5" - 记录加 5 ，记录现在是 [5]
//"2" - 记录加 2 ，记录现在是 [5, 2]
//"C" - 使前一次得分的记录无效并将其移除，记录现在是 [5].
//"D" - 记录加 2 * 5 = 10 ，记录现在是 [5, 10].
//"+" - 记录加 5 + 10 = 15 ，记录现在是 [5, 10, 15].
//所有得分的总和 5 + 10 + 15 = 30
// 
//
// 示例 2： 
//
// 
//输入：ops = ["5","-2","4","C","D","9","+","+"]
//输出：27
//解释：
//"5" - 记录加 5 ，记录现在是 [5]
//"-2" - 记录加 -2 ，记录现在是 [5, -2]
//"4" - 记录加 4 ，记录现在是 [5, -2, 4]
//"C" - 使前一次得分的记录无效并将其移除，记录现在是 [5, -2]
//"D" - 记录加 2 * -2 = -4 ，记录现在是 [5, -2, -4]
//"9" - 记录加 9 ，记录现在是 [5, -2, -4, 9]
//"+" - 记录加 -4 + 9 = 5 ，记录现在是 [5, -2, -4, 9, 5]
//"+" - 记录加 9 + 5 = 14 ，记录现在是 [5, -2, -4, 9, 5, 14]
//所有得分的总和 5 + -2 + -4 + 9 + 5 + 14 = 27
// 
//
// 示例 3： 
//
// 
//输入：ops = ["1"]
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= ops.length <= 1000 
// ops[i] 为 "C"、"D"、"+"，或者一个表示整数的字符串。整数范围是 [-3 * 104, 3 * 104] 
// 对于 "+" 操作，题目数据保证记录此操作时前面总是存在两个有效的分数 
// 对于 "C" 和 "D" 操作，题目数据保证记录此操作时前面总是存在一个有效的分数 
// 
// Related Topics 栈 
// 👍 158 👎 0

import java.util.Stack;

/**
 * Java：棒球比赛 
 
 * @author laijunlin
 * @data 2020-12-17 16:03:21
 */
public class Problem_682_棒球比赛{
    public static void main(String[] args) {
        Solution solution = new Problem_682_棒球比赛().new Solution();
        // TO TEST
        solution.calPoints(new String[]{"5","2","C","D","+"});
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int calPoints(String[] ops) {
        int result  = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            if("+".equals(ops[i])){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b);
                stack.push(a);
                stack.push(a+b);
            }
            else if("C".equals(ops[i])){
                stack.pop();
            }
            else if("D".equals(ops[i])){
                int c = stack.peek();
                stack.push(c*2);
            }else{
                stack.push(Integer.valueOf(ops[i]));
            }
        }
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


