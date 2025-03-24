class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        // (점수, 원래 인덱스) 형태의 배열 생성
        int[][] scoresWithIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            scoresWithIndex[i][0] = score[i]; // 점수
            scoresWithIndex[i][1] = i;        // 원래 인덱스 저장
        }

        // 점수를 기준으로 내림차순 정렬
        Arrays.sort(scoresWithIndex, (a, b) -> b[0] - a[0]);

        // 순위에 따라 결과 저장
        for (int rank = 0; rank < n; rank++) {
            int index = scoresWithIndex[rank][1];
            if (rank == 0) result[index] = "Gold Medal";
            else if (rank == 1) result[index] = "Silver Medal";
            else if (rank == 2) result[index] = "Bronze Medal";
            else result[index] = String.valueOf(rank + 1);
        }

        return result;        
    }
}