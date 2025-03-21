class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) return 0;

        int totalDuration = 0;
        
        for (int i = 0; i < timeSeries.length - 1; i++) {
            // 현재 공격과 다음 공격 사이의 간격을 계산
            int gap = timeSeries[i + 1] - timeSeries[i];
            // 독 지속 시간과 간격 중 작은 값을 더함
            totalDuration += Math.min(gap, duration);
        }
        
        // 마지막 공격은 무조건 duration 만큼 지속됨
        return totalDuration + duration;
    }
}