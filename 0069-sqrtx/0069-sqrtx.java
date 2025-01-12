class Solution {
    /**
     * <h2>Brute Force 접근법 사용</h2>
     */
    public int mySqrt(int x) {
        // x가 0 또는 1인 경우 바로 반환
        if (x == 0 || x == 1) {
            return x;
        }

        // 1부터 x까지 순차적으로 탐색
        for (int i = 1; i <= x; i++) {
            // i의 제곱(i * i)이 x보다 커지면, 바로 직전 숫자가 정답(long : 오버플로우를 방지)
            if ((long) i * i > x) {
                return i - 1; // i-1이 정수 제곱근
            }
        }

        // 모든 경우를 다 탐색해도 x의 제곱근이 없으면 기본값 반환
        return -1; // 이 코드는 실행되지 않음 (논리적으로 모든 x에 대해 결과 있음)
    }
}