class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26]; // 알파벳 개수 저장 배열

        // 문자열을 순회하면서 각 문자 개수 카운트
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // 다시 문자열을 순회하면서 유일한 문자의 인덱스 찾기
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i; // 첫 번째로 등장하는 유일한 문자 반환
            }
        }

        return -1; // 유일한 문자가 없는 경우
    }
}