class Solution {
    public int arrayPairSum(int[] nums) {
        // 배열 정렬
        Arrays.sort(nums);
        
        int sum = 0;
        // 인덱스 0, 2, 4, ... 위치 값들의 합
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        
        return sum;
    }
}