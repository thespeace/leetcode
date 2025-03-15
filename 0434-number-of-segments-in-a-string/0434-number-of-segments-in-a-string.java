class Solution {
    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                count++; // 이전 문자가 공백이고 현재 문자가 문자면 새로운 단어 시작
            }
        }
        return count;
    }
}