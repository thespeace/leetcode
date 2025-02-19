class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26]; // 영어 소문자만 고려

        // s에서 +1, t에서 -1
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // 모든 값이 0이면 아나그램
        for (int num : count) {
            if (num != 0) return false;
        }
        return true;
    }
}