class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // 숫자가 등장한 위치를 음수 마킹
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;  // 1-based -> 0-based 인덱스 변환
            if (nums[index] > 0) {  // 이미 음수면 중복이므로 변경 X
                nums[index] = -nums[index];
            }
        }

        // 양수인 위치의 인덱스가 누락된 숫자
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {  // 여전히 양수라면 해당 숫자가 사라진 것
                result.add(i + 1);  // 0-based -> 1-based 변환
            }
        }

        return result;
    }
}