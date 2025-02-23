class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length; // nums는 배열이므로 .length 사용
        
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i]; // XOR 연산을 활용한 풀이
        }
        
        return missing;
    }
}