class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lineCount = 1;
        int curWidth = 0;

        for (char c : s.toCharArray()) {
            int w = widths[c - 'a'];
            if (curWidth + w > 100) {
                lineCount++;
                curWidth = w;
            } else {
                curWidth += w;
            }
        }

        return new int[] { lineCount, curWidth };
    }
}