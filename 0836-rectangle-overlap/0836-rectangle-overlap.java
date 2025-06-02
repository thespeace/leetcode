class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2] <= rec2[0] ||  // 왼쪽
                 rec1[0] >= rec2[2] ||  // 오른쪽
                 rec1[3] <= rec2[1] ||  // 아래
                 rec1[1] >= rec2[3]);   // 위
    }
}