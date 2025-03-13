class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) { // 3과 5의 공배수
                result.add("FizzBuzz");
            } else if (i % 3 == 0) { // 3의 배수
                result.add("Fizz");
            } else if (i % 5 == 0) { // 5의 배수
                result.add("Buzz");
            } else { // 숫자 그대로 추가
                result.add(String.valueOf(i));
            }
        }
        
        return result;
    }
}