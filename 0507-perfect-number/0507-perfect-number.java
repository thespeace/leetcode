class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;

        int sum = 1; // 1은 항상 약수
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) { // 중복 방지 (제곱수가 아닐 경우)
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}