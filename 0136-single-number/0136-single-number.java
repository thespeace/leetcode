class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR 연산으로 중복 제거
        }
        return result; // 최종적으로 남는 숫자가 한 번만 나타난 숫자
    }
}