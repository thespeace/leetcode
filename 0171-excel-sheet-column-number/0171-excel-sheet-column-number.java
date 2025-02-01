class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            // 현재 문자를 숫자로 변환 (A -> 1, B -> 2, ..., Z -> 26)
            int value = columnTitle.charAt(i) - 'A' + 1;

            // 기존 결과에 26을 곱하고 현재 값을 더함
            result = result * 26 + value;
        }

        return result;
    }
}