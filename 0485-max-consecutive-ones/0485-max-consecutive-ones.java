class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;  // 최대 연속된 1의 개수
        int currentCount = 0;  // 현재 연속된 1의 개수
        
        for (int num : nums) {
            if (num == 1) {
                currentCount++;  // 1이면 증가
                maxCount = Math.max(maxCount, currentCount);  // 최대값 업데이트
            } else {
                currentCount = 0;  // 0이면 초기화
            }
        }
        
        return maxCount;
    }
}