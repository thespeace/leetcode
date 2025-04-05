class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;          // 원래 행 개수
        int n = mat[0].length;       // 원래 열 개수
        
        // reshape가 불가능한 경우: 원소 수가 다름
        if (m * n != r * c) return mat;

        int[][] result = new int[r][c];
        
        // i는 전체 원소의 인덱스를 의미
        for (int i = 0; i < m * n; i++) {
            // 원래 행렬에서의 위치
            int oldRow = i / n;
            int oldCol = i % n;

            // 새로운 행렬에서의 위치
            int newRow = i / c;
            int newCol = i % c;

            result[newRow][newCol] = mat[oldRow][oldCol];
        }
        
        return result;
    }
}