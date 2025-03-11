class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();

        // 가능한 모든 시간(0~11)과 분(0~59)을 탐색
        for (int h = 0; h < 12; h++) {   // 4비트 (시간)
            for (int m = 0; m < 60; m++) { // 6비트 (분)
                // h와 m을 이진수로 변환했을 때, 1의 개수가 turnedOn과 같으면 추가
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    result.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return result;
    }
}