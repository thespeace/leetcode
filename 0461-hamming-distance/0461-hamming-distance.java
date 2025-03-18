class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);  // XOR 결과에서 1의 개수 반환
    }
}