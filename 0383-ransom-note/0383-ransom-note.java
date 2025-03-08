class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];  // 알파벳 개수 저장

        // magazine의 문자 개수 카운트
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // ransomNote의 문자 개수와 비교
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) return false; // 필요한 문자가 부족한 경우
            count[c - 'a']--;
        }

        return true;
    }
}