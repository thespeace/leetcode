class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0; // 0이 아닌 숫자가 들어갈 위치

        // 0이 아닌 요소를 앞으로 이동
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // 나머지 부분을 0으로 채우기
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}