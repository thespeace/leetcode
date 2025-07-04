class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int left = 0, right = n;
        int[] result = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = left++;
            } else {
                result[i] = right--;
            }
        }

        result[n] = left; // 마지막에 남은 값 (left == right)

        return result;
    }
}