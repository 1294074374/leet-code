package leetcode.editor.cn;
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 774 👎 0

/**
 * Java：移动零 
 
 * @author laijunlin
 * @data 2020-10-21 10:42:52
 */
public class Problem_283_移动零{
    public static void main(String[] args) {
        Solution solution = new Problem_283_移动零().new Solution();
        // TO TEST
        int[] arr = {1,2,0,3,1};
        solution.moveZeroes(arr);
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null) {
            return;
        }
        //第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
        int j = 0;
        for(int i=0;i<nums.length;++i) {
            if(nums[i]!=0) {
                nums[j++] = nums[i];
            }
        }
        //非0元素统计完了，剩下的都是0了
        //所以第二次遍历把末尾的元素都赋为0即可
        for(int i=j;i<nums.length;++i) {
            nums[i] = 0;
        }
    }
}


//leetcode submit region end(Prohibit modification and deletion)

}


