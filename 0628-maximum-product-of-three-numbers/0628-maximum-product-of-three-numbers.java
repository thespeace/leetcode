class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums); // 정렬

        int n = nums.length;

        // 가장 큰 세 수
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // 가장 작은 두 수(음수)와 가장 큰 수
        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }
}