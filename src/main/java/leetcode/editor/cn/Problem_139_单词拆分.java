package leetcode.editor.cn;
//给定一个非空字符串 s 和一个包含非空单词的列表 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。 
//
// 说明： 
//
// 
// 拆分时可以重复使用字典中的单词。 
// 你可以假设字典中没有重复的单词。 
// 
//
// 示例 1： 
//
// 输入: s = "leetcode", wordDict = ["leet", "code"]
//输出: true
//解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
// 
//
// 示例 2： 
//
// 输入: s = "applepenapple", wordDict = ["apple", "pen"]
//输出: true
//解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
//     注意你可以重复使用字典中的单词。
// 
//
// 示例 3： 
//
// 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
//输出: false
// 
// Related Topics 字典树 记忆化搜索 哈希表 字符串 动态规划 👍 1208 👎 0


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Java：单词拆分
 *
 * @author laijunlin
 * @data 2021-10-19 11:23:57
 */
public class Problem_139_单词拆分 {
    public static void main(String[] args) {
        Solution solution = new Problem_139_单词拆分().new Solution();
        String s = "aaaaaaa";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("aaaa");
        wordDict.add("aaa");
        System.out.println(solution.wordBreak(s, wordDict));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        boolean[] mem;

        public boolean backtrack(String s, int start, Set<String> set) {
            if (s.length() == 0) {
                return true;
            }
            if (mem[start]) {
                return false;
            }
            for (int i = 0; i < s.length(); i++) {
                if (set.contains(s.substring(0, i + 1))) {
                    if (backtrack(s.substring(i + 1), start + i + 1, set)) {
                        return true;
                    }
                }
            }
            mem[start] = true;
            return false;
        }

        public boolean wordBreak(String s, List<String> wordDict) {
            this.mem = new boolean[s.length()];
            Set<String> set = new HashSet<>(wordDict);
            return backtrack(s, 0, set);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}