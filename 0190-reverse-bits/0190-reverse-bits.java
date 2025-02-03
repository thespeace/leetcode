public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) { // 32비트 반복
            int bit = n & 1; // 현재 마지막 비트 가져오기
            result = (result << 1) | bit; // 결과값을 왼쪽으로 밀고 비트 추가
            n >>= 1; // 원래 숫자를 오른쪽으로 한 칸 이동 (다음 비트 처리)
        }

        return result;
    }
}