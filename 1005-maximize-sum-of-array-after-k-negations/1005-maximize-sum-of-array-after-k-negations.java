class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        int i = 0;
        while (i < nums.length && k > 0) {
            if (nums[i] < 0) {
                nums[i] *= -1;
                k--;
            }
            i++;
        }

        // 최종 k가 홀수면, 가장 작은 값 다시 뒤집음
        Arrays.sort(nums); // 다시 정렬해서 최소값 찾음
        if (k % 2 == 1) {
            nums[0] *= -1;
        }

        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }
}