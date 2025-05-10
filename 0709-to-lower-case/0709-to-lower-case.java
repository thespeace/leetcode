class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result.append((char)(c + 32)); // ASCII: 'A'=65, 'a'=97 → 차이 32
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}