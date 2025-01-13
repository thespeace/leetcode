class Solution {
    public int climbStairs(int n) {
        if(n <= 1) return 1;

        // DP 배열 없이 변수 2개로 피보나치 수열 계산
        int first = 1;  // n = 1일 때 경우의 수
        int second = 1; // n = 2일 때 경우의 수

        // 반복문으로 n까지 계산
        for (int i = 2; i <= n; i++) {
            int temp = first + second; // 현재 경우의 수는 이전 두 경우의 합
            first = second;            // 이전 두 값을 업데이트
            second = temp;
        }

        return second;
    }
}