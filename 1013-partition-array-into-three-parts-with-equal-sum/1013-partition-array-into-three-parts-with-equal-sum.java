class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;

        if (total % 3 != 0) return false;
        int target = total / 3;

        int sum = 0, count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == target) {
                count++;
                sum = 0;
                if (count == 2 && i < arr.length - 1) return true; // 나머지는 세 번째 파트
            }
        }

        return false;
    }
}