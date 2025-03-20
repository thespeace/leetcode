class Solution {
    public int[] constructRectangle(int area) {
        // 가장 큰 W를 찾기 위해 √area부터 1까지 역순으로 탐색
        for (int W = (int) Math.sqrt(area); W >= 1; W--) {
            if (area % W == 0) { // W가 약수인지 확인
                int L = area / W; // L을 계산
                return new int[]{L, W}; // L과 W 반환
            }
        }
        return new int[]{area, 1}; // 기본적으로 주어진 area는 (area, 1) 가능
    }
}