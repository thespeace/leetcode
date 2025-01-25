class Solution {
    public boolean isPalindrome(String s) {
        // 투 포인터 사용, 초기화
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // 왼쪽 포인터가 알파벳/숫자가 아닐 경우 이동
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // 오른쪽 포인터가 알파벳/숫자가 아닐 경우 이동
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // 비교 (대소문자 무시)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // 포인터 이동
            left++;
            right--;
        }

        return true;
    }
}