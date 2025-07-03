class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        int i = 0;

        // 올라가는 구간
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // 꼭대기가 처음이나 끝이면 안 됨
        if (i == 0 || i == n - 1) return false;

        // 내려가는 구간
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;  // 끝까지 도달했는지?
    }
}