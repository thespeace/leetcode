class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // 1을 빼서 0-based index로 조정
            char ch = (char) ('A' + (columnNumber % 26)); // 나머지로 문자 찾기
            result.append(ch);
            columnNumber /= 26; // 다음 자리 계산
        }

        return result.reverse().toString(); // 뒤집어서 반환
    }
}