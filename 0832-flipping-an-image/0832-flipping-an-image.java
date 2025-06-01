class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int[] row : image) {
            int left = 0, right = row.length - 1;

            while (left <= right) {
                // 값 반전 후 swap (XOR 사용)
                int temp = row[left] ^ 1;
                row[left] = row[right] ^ 1;
                row[right] = temp;
                left++;
                right--;
            }
        }

        return image;
    }
}