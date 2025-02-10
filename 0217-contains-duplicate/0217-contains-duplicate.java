class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true; // 중복 발견
            }
            set.add(num);
        }

        return false; // 중복 없음
    }
}