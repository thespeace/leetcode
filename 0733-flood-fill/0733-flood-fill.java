class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // 깊이 우선 탑색, 나중에 다시 보기(어려움)
        int originalColor = image[sr][sc];

        if (originalColor == color) return image;

        dfs(image, sr, sc, originalColor, color);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int originalColor, int color) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length) return;
        if (image[r][c] != originalColor) return;

        image[r][c] = color;

        dfs(image, r + 1, c, originalColor, color);
        dfs(image, r - 1, c, originalColor, color);
        dfs(image, r, c + 1, originalColor, color);
        dfs(image, r, c - 1, originalColor, color);
    }
}