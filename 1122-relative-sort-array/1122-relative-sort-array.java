class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> order = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            order.put(arr2[i], i);
        }

        Integer[] temp = Arrays.stream(arr1).boxed().toArray(Integer[]::new);

        Arrays.sort(temp, (a, b) -> {
            int idxA = order.getOrDefault(a, Integer.MAX_VALUE);
            int idxB = order.getOrDefault(b, Integer.MAX_VALUE);
            if (idxA != idxB) {
                return idxA - idxB;
            }
            return a - b;
        });

        return Arrays.stream(temp).mapToInt(Integer::intValue).toArray();
    }
}