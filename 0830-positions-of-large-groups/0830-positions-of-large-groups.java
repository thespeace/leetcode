class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int n = s.length();
        int i = 0;

        while (i < n) {
            int j = i;
            while (j < n && s.charAt(i) == s.charAt(j)) {
                j++;
            }
            if (j - i >= 3) {
                result.add(Arrays.asList(i, j - 1));
            }
            i = j;
        }

        return result;
    }
}