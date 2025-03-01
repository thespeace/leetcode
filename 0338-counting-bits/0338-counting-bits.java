class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i & (i - 1)] + 1; // 가장 낮은 1을 제거한 값 + 1
        }
        return dp;
    }
}