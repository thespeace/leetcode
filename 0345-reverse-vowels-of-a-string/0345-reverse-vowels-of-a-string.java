class Solution {
    public String reverseVowels(String s) {
        // 모음 집합 생성 (대소문자 포함)
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 
                                       'A', 'E', 'I', 'O', 'U');
        
        char[] arr = s.toCharArray(); // 문자열을 char 배열로 변환
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // 왼쪽에서 모음 찾기
            while (left < right && !vowels.contains(arr[left])) left++;
            // 오른쪽에서 모음 찾기
            while (left < right && !vowels.contains(arr[right])) right--;
            
            // 모음 swap
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }

        return new String(arr); // char 배열을 다시 문자열로 변환하여 반환
    }
}