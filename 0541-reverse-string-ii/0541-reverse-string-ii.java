class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray(); // 문자열을 문자 배열로 변환
        int n = arr.length;

        // i는 2k 단위로 증가하면서 k개씩 반전 수행
        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); // 범위를 초과하지 않도록 설정
            reverse(arr, left, right);
        }

        return new String(arr); // 수정된 문자 배열을 문자열로 변환
    }

    // 배열 내에서 특정 구간의 문자들을 반전하는 함수
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}