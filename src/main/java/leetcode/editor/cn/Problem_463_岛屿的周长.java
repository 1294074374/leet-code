package leetcode.editor.cn;
//给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。 
//
// 网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。 
//
// 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿
//的周长。 
//
// 
//
// 示例 : 
//
// 输入:
//[[0,1,0,0],
// [1,1,1,0],
// [0,1,0,0],
// [1,1,0,0]]
//
//输出: 16
//
//解释: 它的周长是下面图片中的 16 个黄色的边：
//
//
// 
// Related Topics 哈希表 
// 👍 341 👎 0

/**
 * Java：岛屿的周长
 *
 * @author laijunlin
 * @data 2020-11-02 14:01:51
 */
public class Problem_463_岛屿的周长 {
    public static void main(String[] args) {
        Solution solution = new Problem_463_岛屿的周长().new Solution();
        // TO TEST
        int[][] test = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0},};
        System.out.println(solution.islandPerimeter(test));
    }

    /***
     * 模板
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int islandPerimeter(int[][] grid) {
            int x = grid.length;
            int y = grid[0].length;
            int length = 0;
            int[][] map = new int[x + 2][y + 2];

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    map[i + 1][j + 1] = grid[i][j];
                }
            }

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (grid[i][j] == 1) {
                        int l = findLength(i, j, grid, map);
                        length += l;
                    }
                }
            }
            return length;
        }

        private int findLength(int i, int j, int[][] grid, int[][] map) {
            i++;
            j++;
            int temp = 4;
            temp = temp - map[i - 1][j] - map[i + 1][j] - map[i][j - 1] - map[i][j + 1];
            // 左上角

            return temp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


