class Solution {
    public int addDigits(int num) {
        while (num >= 10) { // 한 자리 숫자가 될 때까지 반복
            int sum = 0;
            while (num > 0) { // 각 자리 숫자를 더함
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}