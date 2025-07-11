class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);  // 오름차순 정렬

        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i - 2], b = nums[i - 1], c = nums[i];
            if (a + b > c) {
                return a + b + c;
            }
        }

        return 0;
    }
}