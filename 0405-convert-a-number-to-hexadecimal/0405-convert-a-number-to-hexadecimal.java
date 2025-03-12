class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        
        StringBuilder sb = new StringBuilder();
        char[] hex = "0123456789abcdef".toCharArray(); // 16진수 문자 배열

        while (num != 0) {
            sb.append(hex[num & 15]); // 하위 4비트(16진수 한 자리) 추출
            num >>>= 4; // 부호 없는 오른쪽 이동
        }

        return sb.reverse().toString(); // 역순 변환 후 반환
    }
}