class Solution {
    public int findLUSlength(String a, String b) {
        // 두 문자열이 같으면 공통된 서브시퀀스만 존재
        if (a.equals(b)) return -1;
        // 두 문자열이 다르면 더 긴 문자열이 가장 긴 Uncommon 서브시퀀스
        return Math.max(a.length(), b.length());
    }
}