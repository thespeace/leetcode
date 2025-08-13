class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        // 1. 복제될 0의 개수 계산
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) zeros++;
        }

        // 2. 뒤에서부터 이동
        int i = n - 1;
        int j = n + zeros - 1; // 가상의 확장된 배열 인덱스
        while (i >= 0 && j >= 0) {
            if (arr[i] != 0) {
                if (j < n) arr[j] = arr[i];
            } else {
                if (j < n) arr[j] = 0;
                j--;
                if (j < n) arr[j] = 0;
            }
            i--;
            j--;
        }
    }
}