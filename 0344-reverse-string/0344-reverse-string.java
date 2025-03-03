class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            // 두 포인터가 가리키는 값을 스왑
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // 포인터 이동
            left++;
            right--;
        }
    }
}