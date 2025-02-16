//StringBuilder : 문자열 연결 시 + 연산보다 성능이 우수하여 효율적인 문자열 처리가 가능
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result; // 빈 배열일 경우 빈 리스트 반환

        int start = nums[0]; // 범위의 시작점
        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i] != nums[i - 1] + 1) { // 연속되지 않으면 범위 종료
                StringBuilder sb = new StringBuilder();
                sb.append(start);
                if (start != nums[i - 1]) { // 시작점과 끝점이 다를 경우만 "->" 추가
                    sb.append("->").append(nums[i - 1]);
                }
                result.add(sb.toString()); // 결과 리스트에 추가

                if (i < nums.length) start = nums[i]; // 새로운 범위 시작
            }
        }
        return result;
    }
}