package leetcode.editor.cn;
//给你一个仅由大写英文字母组成的字符串，你可以将任意位置上的字符替换成另外的字符，总共可最多替换 k 次。在执行上述操作后，找到包含重复字母的最长子串的长度。
// 
//
// 注意：字符串长度 和 k 不会超过 10⁴。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "ABAB", k = 2
//输出：4
//解释：用两个'A'替换为两个'B',反之亦然。
// 
//
// 示例 2： 
//
// 
//输入：s = "AABABBA", k = 1
//输出：4
//解释：
//将中间的一个'A'替换为'B',字符串变为 "AABBBBA"。
//子串 "BBBB" 有最长重复字母, 答案为 4。
// 
// Related Topics 哈希表 字符串 滑动窗口 👍 493 👎 0


/**
 * Java：替换后的最长重复字符
 
 * @author laijunlin
 * @data 2021-10-14 15:22:09
 */
public class Problem_424_替换后的最长重复字符{
	public static void main(String[] args) {
		Solution solution = new Problem_424_替换后的最长重复字符().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int characterReplacement(String s, int k) {
		int[] num = new int[26];
		int n = s.length();
		int maxn = 0;
		int left = 0, right = 0;
		while (right < n) {
			num[s.charAt(right) - 'A']++;
			maxn = Math.max(maxn, num[s.charAt(right) - 'A']);
			if (right - left + 1 - maxn > k) {
				num[s.charAt(left) - 'A']--;
				left++;
			}
			right++;
		}
		return right - left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}