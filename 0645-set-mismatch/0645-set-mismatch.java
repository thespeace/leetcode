class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int duplicate = -1;
        int n = nums.length;
        int total = 0;

        for (int num : nums) {
            if (!seen.add(num)) {
                duplicate = num; // 이미 존재하는 숫자라면 중복
            }
            total += num;
        }

        int expectedSum = n * (n + 1) / 2;
        int missing = expectedSum - (total - duplicate); // 빠진 숫자 = 기대 합 - (실제 합 - 중복)

        return new int[]{duplicate, missing};
    }
}