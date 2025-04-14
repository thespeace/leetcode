class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        // list1의 문자열을 map에 저장 (문자열 -> 인덱스)
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        // list2를 순회하며 공통된 문자열이 있는지 확인
        for (int j = 0; j < list2.length; j++) {
            String word = list2[j];
            if (map.containsKey(word)) {
                int sum = j + map.get(word);

                // 인덱스 합이 최소라면 결과 리스트 갱신
                if (sum < minSum) {
                    result.clear();
                    result.add(word);
                    minSum = sum;
                }
                // 같은 최소값이면 추가
                else if (sum == minSum) {
                    result.add(word);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}