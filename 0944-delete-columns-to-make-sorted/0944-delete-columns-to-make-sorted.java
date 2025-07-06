class Solution {
    public int minDeletionSize(String[] strs) {
        int row = strs.length;
        int col = strs[0].length();
        int count = 0;

        for (int c = 0; c < col; c++) {
            for (int r = 1; r < row; r++) {
                if (strs[r].charAt(c) < strs[r - 1].charAt(c)) {
                    count++;
                    break;  // 이 열은 삭제해야 하므로 바로 다음 열로
                }
            }
        }

        return count;
    }
}