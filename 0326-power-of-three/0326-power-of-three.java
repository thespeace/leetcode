class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false; // 0 이하의 숫자는 불가능

        while (n % 3 == 0) { // 3으로 나누어 떨어지는 동안 나누기
            n /= 3;
        }

        return n == 1; // 최종 값이 1이면 3의 거듭제곱
    }
}