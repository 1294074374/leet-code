package leetcode.editor.cn;
//假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。 
//
// 给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。能否在不打破种植规则的情况下种入 n 朵花？能则返回True
//，不能则返回False。 
//
// 示例 1: 
//
// 
//输入: flowerbed = [1,0,0,0,1], n = 1
//输出: True
// 
//
// 示例 2: 
//
// 
//输入: flowerbed = [1,0,0,0,1], n = 2
//输出: False
// 
//
// 注意: 
//
// 
// 数组内已种好的花不会违反种植规则。 
// 输入的数组长度范围为 [1, 20000]。 
// n 是非负整数，且不会超过输入数组的大小。 
// 
// Related Topics 数组 
// 👍 197 👎 0

/**
 * Java：种花问题 
 
 * @author laijunlin
 * @data 2020-11-20 09:22:11
 */
public class Problem_605_种花问题{
    public static void main(String[] args) {
        Solution solution = new Problem_605_种花问题().new Solution();
        // TO TEST
        solution.canPlaceFlowers(new int[]{1,0,0,0,1,0,0},2);
    }
    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if(flowerbed.length == 1){
            if(flowerbed[0]==0){
                count++;
                return count >= n;
            }
        }
        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            count++;
        }
        for (int i = 1; i < flowerbed.length-1; i++) {
            if(flowerbed[i] == 0 && (flowerbed[i-1] == 0 && flowerbed[i+1] == 0)){
                flowerbed[i] = 1;
                count++;
            }
        }
        if(flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0){
            flowerbed[0] = 1;
            count++;
        }
        return count >= n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


