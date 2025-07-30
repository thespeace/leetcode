class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            maxHeap.add(stone);
        }

        while (maxHeap.size() > 1) {
            int y = maxHeap.poll(); // 가장 큰 돌
            int x = maxHeap.poll(); // 두 번째로 큰 돌

            if (y != x) {
                maxHeap.add(y - x);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}