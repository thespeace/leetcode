class Solution {
    public boolean isPowerOfFour(int n) {
        // 양수인지 확인
        // 2의 거듭제곱인지 확인 (n이 한 개의 비트만 1인지 체크)
        // 4의 거듭제곱인지 확인 (1이 있는 비트가 홀수 번째 위치인지 체크)
        return (n > 0) && ((n & (n - 1)) == 0) && ((n & 0xAAAAAAAA) == 0);
    }
}