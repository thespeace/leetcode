class Solution {
    public String reverseWords(String s) {
        // 공백을 기준으로 단어를 배열로 분할
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            // StringBuilder를 사용하여 단어 뒤집기
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            
            // 결과 문자열에 추가 (공백 포함)
            result.append(reversedWord).append(" ");
        }
        
        // 마지막 공백 제거 후 반환
        return result.toString().trim();
    }
}