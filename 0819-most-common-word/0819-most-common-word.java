class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word.toLowerCase());
        }

        paragraph = paragraph.toLowerCase().replaceAll("[!?',;\\.]", " ");

        String[] words = paragraph.split("\\s+");
        Map<String, Integer> countMap = new HashMap<>();

        for (String word : words) {
            if (!bannedSet.contains(word) && word.length() > 0) {
                countMap.put(word, countMap.getOrDefault(word, 0) + 1);
            }
        }

        String result = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > max) {
                result = entry.getKey();
                max = entry.getValue();
            }
        }

        return result;
    }
}