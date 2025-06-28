class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int evenIdx = 0;
        int oddIdx = 1;

        int[] result = new int[n];

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIdx] = num;
                evenIdx += 2;
            } else {
                result[oddIdx] = num;
                oddIdx += 2;
            }
        }

        return result;
    }
}