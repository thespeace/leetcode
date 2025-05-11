class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            if (bits[i] == 1) {
                i += 2; // 2비트 문자
            } else {
                i += 1; // 1비트 문자
            }
        }
        return i == bits.length - 1;
    }
}