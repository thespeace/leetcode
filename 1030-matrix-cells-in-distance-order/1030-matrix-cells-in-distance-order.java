class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {

        int[][] result = new int[R * C][2];
        int index = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                result[index++] = new int[]{i, j};
            }
        }

        Arrays.sort(result, (a, b) -> {
            int da = Math.abs(a[0] - r0) + Math.abs(a[1] - c0);
            int db = Math.abs(b[0] - r0) + Math.abs(b[1] - c0);
            return da - db;
        });

        return result;
    }
}