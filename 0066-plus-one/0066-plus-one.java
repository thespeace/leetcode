class Solution {
    public int[] plusOne(int[] digits) {

        // 배열 뒷자리부터 확인
        for (int i = digits.length - 1; i >= 0; i--) {
            // 9가 아니면 해당 자리에 1을 더하고 반환
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // 9라면 해당 자리를 0으로 바꾸고, 다음 자리를 확인
            digits[i] = 0;
        }

        // 자릿수가 증가한 경우 (모든 자리가 9인 경우), 새로운 배열을 만들어 맨 앞자리에 1을 추가
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}