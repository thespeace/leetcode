class Solution {
    public char findTheDifference(String s, String t) {
        int xor = 0;

        // 모든 문자에 대해 XOR 연산 수행
        for (char c : s.toCharArray()) {
            xor ^= c;
        }

        for (char c : t.toCharArray()) {
            xor ^= c;
        }

        return (char) xor; // 남은 문자가 추가된 문자
    }
}