class Solution {
    public boolean isIsomorphic(String s, String t) {
        // 두 문자열 길이가 다르면 바로 false 반환
        if (s.length() != t.length()) {
            return false;
        }

        // 두 문자열의 문자가 대응되는지 저장할 HashMap 생성
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        // 두 문자열을 한 문자씩 비교하면서 매핑 확인
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            // s의 문자가 이미 다른 문자와 매핑된 경우
            if (mapS.containsKey(sc)) {
                if (mapS.get(sc) != tc) {
                    return false; // 일치하지 않으면 false
                }
            } else {
                mapS.put(sc, tc); // 새로운 매핑
            }

            // t의 문자가 이미 다른 문자와 매핑된 경우
            if (mapT.containsKey(tc)) {
                if (mapT.get(tc) != sc) {
                    return false; // 일치하지 않으면 false
                }
            } else {
                mapT.put(tc, sc); // 새로운 매핑
            }
        }

        return true; // 모든 문자가 일관성 있게 매핑되었다면 true
    }
}