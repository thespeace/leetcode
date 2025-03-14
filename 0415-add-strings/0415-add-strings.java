class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int n1 = (i >= 0) ? num1.charAt(i--) - '0' : 0; // num1의 현재 자리 숫자
            int n2 = (j >= 0) ? num2.charAt(j--) - '0' : 0; // num2의 현재 자리 숫자
            
            int sum = n1 + n2 + carry; // 현재 자리의 합
            carry = sum / 10;          // 올림수 계산
            result.append(sum % 10);   // 현재 자리 숫자 저장
        }

        return result.reverse().toString(); // 최종 결과 뒤집어서 반환
    }
}