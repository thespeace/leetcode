class Solution {
    public double largestTriangleArea(int[][] points) {
        //벡터 외적 공식 사용
        //TODO 다시 보기
        double maxArea = 0;

        for (int i = 0; i < points.length; i++) {
            int[] A = points[i];
            for (int j = i + 1; j < points.length; j++) {
                int[] B = points[j];
                for (int k = j + 1; k < points.length; k++) {
                    int[] C = points[k];

                    double area = 0.5 * Math.abs(
                        A[0] * (B[1] - C[1]) +
                        B[0] * (C[1] - A[1]) +
                        C[0] * (A[1] - B[1])
                    );

                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }
}