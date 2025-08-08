class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // 두 문자열을 이어붙였을 때 결과가 같아야 공통 패턴이 존재함
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // 길이의 GCD 구하기
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    // 최대공약수(유클리드 호제법)
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}