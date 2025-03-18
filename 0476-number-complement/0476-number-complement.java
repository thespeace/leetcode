class Solution {
    public int findComplement(int num) {
        int bitLength = Integer.toBinaryString(num).length();
        int mask = (1 << bitLength) - 1;  // 모든 비트를 1로 채운 값
        return num ^ mask;  // XOR 연산을 통해 보수 계산
    }
}