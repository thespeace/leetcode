class Solution {
    /**
     * <h2>이진수 덧셈 규칙</h2>
     * <ul>
     *     <li>0 + 0 = 0</li>
     *     <li>0 + 1 = 1</li>
     *     <li>1 + 0 = 1</li>
     *     <li>1 + 1 = 10 (0을 기록하고, 1을 올림으로 처리)</li>
     * </ul>
     *
     * <p>Easy 난이도 아닌 듯. 1.5시간 걸림</p>
     */
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

         // 두 문자열을 끝에서부터 처리
        while (i >= 0 || j >= 0 || carry > 0) {
            // 각 자리의 숫자를 가져옴. 문자열이 짧아지면 0으로 대체
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            // 현재 자리의 합 = 두 비트 + 올림
            int sum = bitA + bitB + carry;

            // 결과 자리의 값 (0 또는 1)
            result.append(sum % 2);

            // 새로운 올림값 계산 (2 이상이면 1, 그렇지 않으면 0)
            carry = sum / 2;

            // 다음 자리로 이동
            i--;
            j--;
        }

        // 결과는 뒤집혀 있으므로 반전
        return result.reverse().toString();
    }
}