class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0, sumB = 0;
        for (int a : A) sumA += a;
        for (int b : B) sumB += b;

        int delta = (sumB - sumA) / 2;

        Set<Integer> setB = new HashSet<>();
        for (int b : B) setB.add(b);

        for (int a : A) {
            int b = a + delta;
            if (setB.contains(b)) {
                return new int[]{a, b};
            }
        }

        return new int[0]; // 문제 조건상 항상 해답이 존재하므로 도달하지 않음
    }
}