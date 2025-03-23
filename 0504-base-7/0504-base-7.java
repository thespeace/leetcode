class Solution {
    public String convertToBase7(int n) {
        if (n == 0) return "0";

        boolean isNegative = n < 0; // 음수 여부 확인
        n = Math.abs(n); // 절댓값 변환

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 7);
            n /= 7;
        }

        if (isNegative) sb.append('-');
        return sb.reverse().toString();
    }
}