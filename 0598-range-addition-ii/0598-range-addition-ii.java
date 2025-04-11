class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        // 초기 행렬 크기 그대로가 최댓값이 위치할 수 있는 전체 영역
        int minRow = m;
        int minCol = n;

        // 모든 연산을 통해 최솟값 행, 열을 갱신
        for (int[] op : ops) {
            minRow = Math.min(minRow, op[0]);
            minCol = Math.min(minCol, op[1]);
        }

        // 최댓값을 가지는 셀의 개수는 가장 작게 겹친 영역의 넓이
        return minRow * minCol;
    }
}