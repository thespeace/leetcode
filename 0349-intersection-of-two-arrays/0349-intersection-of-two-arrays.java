class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // nums1의 요소를 set1에 저장 (중복 제거)
        for (int num : nums1) {
            set1.add(num);
        }

        // nums2의 요소가 set1에 존재하면 resultSet에 추가
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // 결과를 배열로 변환하여 반환
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}