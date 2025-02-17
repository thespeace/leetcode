class Solution {
    public boolean isPowerOfTwo(int n) {
        // n이 양수이고, n이 2의 거듭제곱이면 n & (n - 1) == 0 성립
        return n > 0 && (n & (n - 1)) == 0;
    }
}