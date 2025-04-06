class Solution {
    public int distributeCandies(int[] candyType) {
        // Set을 사용해 중복을 제거하고 고유한 사탕 종류만 저장
        Set<Integer> set = new HashSet<>();

        // 모든 사탕을 순회하면서 Set에 추가
        for (int candy : candyType) {
            set.add(candy); // 중복 제거됨
        }

        // 여동생이 가질 수 있는 사탕 개수는 총 수의 절반
        int maxTypesSheCanGet = candyType.length / 2;

        // 고유 사탕 종류 수와 절반 중 작은 값을 반환
        return Math.min(set.size(), maxTypesSheCanGet);
    }
}