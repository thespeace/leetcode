class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        // 첫 번째 요소는 항상 1
        row.add(1);

        // 이전 값을 기반으로 현재 행 업데이트
        for (int i = 1; i <= rowIndex; i++) {
            // 뒤에서부터 업데이트 (덮어쓰기 방식)
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            // 행 끝에 1 추가
            row.add(1);
        }
        
        return row;
    }
}