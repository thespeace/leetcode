class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // s의 다음 문자로 이동
            }
            j++; // t의 다음 문자로 이동
        }
        
        return i == s.length(); // s의 모든 문자가 매칭되었는지 확인
    }
}