class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        
        // '-' 제거하고 대문자로 변환
        s = s.replace("-", "").toUpperCase();
        int len = s.length();
        
        // 뒤에서부터 K개 단위로 그룹화
        int firstGroup = len % k;  // 첫 그룹 크기
        if (firstGroup > 0) {
            sb.append(s.substring(0, firstGroup));
        }
        
        for (int i = firstGroup; i < len; i += k) {
            if (sb.length() > 0) sb.append('-');  // 첫 그룹 이후에 '-' 추가
            sb.append(s.substring(i, i + k));
        }
        
        return sb.toString();
    }
}