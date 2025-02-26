class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false; // 단어 개수와 패턴 길이가 다르면 false
        }

        Map<Character, String> map = new HashMap<>(); // 패턴 문자 -> 단어 매핑
        Map<String, Character> reverseMap = new HashMap<>(); // 단어 -> 패턴 문자 매핑

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // 패턴 -> 단어 매핑 검사
            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) {
                    return false; // 일관된 매핑이 아니면 false
                }
            } else {
                map.put(c, word);
            }

            // 단어 -> 패턴 매핑 검사
            if (reverseMap.containsKey(word)) {
                if (reverseMap.get(word) != c) {
                    return false; // 단어가 이미 다른 문자에 매핑되어 있으면 false
                }
            } else {
                reverseMap.put(word, c);
            }
        }
        return true;
    }
}