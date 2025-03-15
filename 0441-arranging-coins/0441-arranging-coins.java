class Solution {
    public int arrangeCoins(int n) {
        long left = 0, right = n;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sum = mid * (mid + 1) / 2; // k번째 줄까지 필요한 동전 개수
            
            if (sum == n) return (int) mid; // 정확히 n개를 사용하면 mid 반환
            else if (sum < n) left = mid + 1; // 더 많은 동전이 필요 -> 증가
            else right = mid - 1; // 너무 많은 동전이 필요 -> 감소
        }
        return (int) right; // 초과하지 않는 최대 k 반환
    }
}