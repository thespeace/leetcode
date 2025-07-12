class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0, right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftVal = nums[left] * nums[left];
            int rightVal = nums[right] * nums[right];

            if (leftVal > rightVal) {
                result[index--] = leftVal;
                left++;
            } else {
                result[index--] = rightVal;
                right--;
            }
        }

        return result;
    }
}