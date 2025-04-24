class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // 처음 k개의 합으로 초기화
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        // 슬라이딩 윈도우 기법 사용, 앞에서 하나 빼고 뒤에서 하나 추가
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k;
    }
}