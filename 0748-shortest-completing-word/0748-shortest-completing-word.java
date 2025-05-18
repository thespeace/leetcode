class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] target = new int[26];

        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                target[Character.toLowerCase(c) - 'a']++;
            }
        }

        String result = null;

        for (String word : words) {
            if (isCompletingWord(word, target)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }

    private boolean isCompletingWord(String word, int[] target) {
        int[] count = new int[26];

        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] < target[i]) {
                return false;
            }
        }

        return true;
    }
}