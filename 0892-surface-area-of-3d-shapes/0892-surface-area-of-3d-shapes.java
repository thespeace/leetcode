class Solution {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int area = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int height = grid[i][j];
                if (height > 0) {
                    // 기본 표면적: 6 * 높이
                    area += height * 6;
                    // 수직 내 겹침: (높이 - 1) * 2
                    area -= (height - 1) * 2;
                }

                // 상하좌우 인접 블록과 겹치는 면 제거
                if (i + 1 < n) {
                    area -= 2 * Math.min(grid[i][j], grid[i + 1][j]);
                }
                if (j + 1 < n) {
                    area -= 2 * Math.min(grid[i][j], grid[i][j + 1]);
                }
            }
        }

        return area;
    }
}