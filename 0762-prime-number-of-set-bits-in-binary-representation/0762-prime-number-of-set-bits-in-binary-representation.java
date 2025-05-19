class Solution {
    public int countPrimeSetBits(int left, int right) {
        // TODO 나중에 비트마스크 활용해서 해결해보기
        int count = 0;

        for (int i = left; i <= right; i++) {
            int bitCount = Integer.bitCount(i);
            if (isPrime(bitCount)) {
                count++;
            }
        }

        return count;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}