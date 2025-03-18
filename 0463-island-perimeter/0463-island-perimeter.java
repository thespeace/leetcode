class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length, cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {  // 땅(1)일 경우
                    perimeter += 4;  // 기본적으로 4변 추가

                    // 상(위쪽)이 땅이면 변이 겹치므로 2 감소
                    if (r > 0 && grid[r - 1][c] == 1) {
                        perimeter -= 2;
                    }
                    // 좌(왼쪽)이 땅이면 변이 겹치므로 2 감소
                    if (c > 0 && grid[r][c - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }
}