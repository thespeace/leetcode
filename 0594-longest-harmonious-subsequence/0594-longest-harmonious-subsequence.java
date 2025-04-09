class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;

        // 각 숫자의 빈도 수를 Map에 저장
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 현재 숫자 + 1 이 존재하면 두 개의 빈도 수 합으로 후보 생성
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                int length = map.get(key) + map.get(key + 1);
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}