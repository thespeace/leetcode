class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Base case
        if (numRows == 0) return null;

        List<List<Integer>> result = new ArrayList<>();

        // 주어진 라인(열) 순회
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) { // 라인 양 끝일 경우 1
                    list.add(1);
                } else { // 라인의 양 끝이 아닐 경우, 값을 구하기 위해 이전 라인에 있던 리스트 객체를 받아 계산
                    int prev = result.get(i-1).get(j-1);
                    int next = result.get(i-1).get(j);
                    list.add(prev+next);
                }
            }
            result.add(list);
        }

        return result;
    }
}