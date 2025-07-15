class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustScore = new int[n + 1]; // index 1~n 사용

        for (int[] t : trust) {
            int a = t[0], b = t[1];
            trustScore[a]--; // 감점
            trustScore[b]++; // 가산점
        }

        for (int i = 1; i <= n; i++) {
            if (trustScore[i] == n - 1) return i;
        }

        return -1;
    }
}