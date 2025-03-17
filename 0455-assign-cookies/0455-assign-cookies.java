class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);  // 최소 요구 쿠키 크기 정렬
        Arrays.sort(s);  // 쿠키 크기 정렬
        
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {  // 현재 쿠키가 i의 최소 요구 조건을 충족하면 배정
                i++;
            }
            j++;
        }
        
        return i;
    }
}