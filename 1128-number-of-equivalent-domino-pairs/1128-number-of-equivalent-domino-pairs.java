class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> map = new HashMap<>();
        int result = 0;
        
        for (int[] d : dominoes) {
            int a = Math.min(d[0], d[1]);
            int b = Math.max(d[0], d[1]);
            String key = a + "," + b;
            
            int count = map.getOrDefault(key, 0);
            result += count; // 지금까지 나온 동일한 도미노 수만큼 쌍이 새로 생김
            map.put(key, count + 1);
        }
        
        return result;
    }
}