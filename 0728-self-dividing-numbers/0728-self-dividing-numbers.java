class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean isSelfDividing(int num) {
        int original = num;

        while (num > 0) {
            int digit = num % 10;

            // 자릿수가 0이거나 나누어 떨어지지 않으면 false
            if (digit == 0 || original % digit != 0) {
                return false;
            }

            num /= 10;
        }

        return true;
    }
}