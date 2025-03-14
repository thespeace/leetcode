class Solution {
    public int thirdMax(int[] nums) {
        Integer first = null, second = null, third = null;

        for (int num : nums) {
            if (Objects.equals(num, first) || Objects.equals(num, second) || Objects.equals(num, third)) {
                continue; // 중복된 값은 건너뛴다.
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }

        return third != null ? third : first; // third가 없으면 first 반환
    }
}