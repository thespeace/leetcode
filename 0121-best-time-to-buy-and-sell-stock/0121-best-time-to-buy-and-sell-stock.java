class Solution {
    public int maxProfit(int[] prices) {
        // 최소 가격 초기화
        int minPrice = Integer.MAX_VALUE;
        // 최대 이익 초기화
        int maxProfit = 0;

        // 배열을 순회하며 최소 가격과 최대 이익 갱신
        for (int price : prices) {
            // 최소 가격 갱신
            if (price < minPrice) {
                minPrice = price;
            }
            // 현재 이익 계산 및 최대 이익 갱신
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}