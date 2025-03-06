class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        // nums1의 요소 개수를 HashMap에 저장
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // nums2의 요소가 HashMap에 있으면 결과 리스트에 추가 후 개수 감소
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // 결과를 배열로 변환하여 반환
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}