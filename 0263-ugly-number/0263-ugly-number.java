class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false; // 0 이하의 수는 Ugly Number가 아님
        
        int[] primes = {2, 3, 5}; // Ugly Number의 소인수
        for (int prime : primes) {
            while (n % prime == 0) { // prime으로 나눌 수 있으면 계속 나눔
                n /= prime;
            }
        }
        return n == 1; // 최종적으로 1이면 Ugly Number
    }
}