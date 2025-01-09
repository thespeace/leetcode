class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle))
            return 0;
        else
            return -1;
    }
}