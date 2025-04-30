class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;

        int maxLength = 1;
        int length = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                length++;
                maxLength = Math.max(maxLength, length);
            } else {
                length = 1;
            }
        }

        return maxLength;
    }
}