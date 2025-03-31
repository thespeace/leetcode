class Solution {
    public boolean checkRecord(String s) {
        int absentCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                absentCount++;
                if (absentCount >= 2) return false; // A가 2개 이상이면 불합격
            }
        }

        // "LLL" 포함 여부 체크
        if (s.contains("LLL")) return false;

        return true; // 모든 조건을 만족하면 true       
    }
}