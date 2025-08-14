class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int give = 1; // 이번에 줄 사탕 개수
        int idx = 0;  // 현재 사람 인덱스

        while (candies > 0) {
            int toGive = Math.min(give, candies);
            res[idx] += toGive;
            candies -= toGive;

            give++;
            idx = (idx + 1) % num_people;
        }

        return res;
    }
}