class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            // 현재 자리가 0이고 양 옆도 비어있을 경우만 꽃을 심을 수 있음
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // 꽃 심기
                    count++;
                    if (count >= n) return true;
                }
            }
        }

        return count >= n;
    }
}