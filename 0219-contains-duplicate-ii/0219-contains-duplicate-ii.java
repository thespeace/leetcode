class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // 숫자와 해당 숫자의 마지막 등장 인덱스를 저장하는 HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // 배열을 순회하며 중복 검사
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                // 중복이 발견되었을 때, 인덱스 차이가 k 이하인지 확인
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            // 현재 숫자의 인덱스를 해시맵에 업데이트
            map.put(nums[i], i);
        }
        return false; // 조건을 만족하는 쌍이 없을 경우 false 반환
    }
}