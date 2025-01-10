class Solution {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.trim().split("\\s+");
        String s2 = s1[s1.length - 1];
        return s2.length();
    }
}