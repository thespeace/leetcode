class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int length = 0;
        
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                length += 2; // 짝수 개로 만들 수 있는 경우 추가
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        return set.isEmpty() ? length : length + 1; // 홀수 개가 하나라도 있으면 중앙에 배치 가능
    }
}