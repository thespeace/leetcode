class Solution {
    public boolean divisorGame(int n) {
        Boolean[] memo = new Boolean[n + 1];
        return canWin(n, memo);
    }

    private boolean canWin(int n, Boolean[] memo) {
        if (n == 1) return false;
        if (memo[n] != null) return memo[n];

        for (int x = 1; x < n; x++) {
            if (n % x == 0 && !canWin(n - x, memo)) {
                return memo[n] = true;
            }
        }
        return memo[n] = false;
    }
}