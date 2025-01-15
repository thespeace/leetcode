/**
 * <h2>시간/공간 복잡도</h2>
 * <p>1. 시간 복잡도: O(m+n) : nums1과 nums2의 전체 길이를 한 번 순회.</p>
 * <p>2. 공간 복잡도: O(1) : 추가 배열을 사용하지 않고, 제자리에서 병합.</p>
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 포인터 초기화
        int p1 = m - 1; // nums1의 실제 값 마지막 인덱스
        int p2 = n - 1; // nums2의 마지막 인덱스
        int p = m + n - 1; // 병합된 배열의 마지막 위치

        // 두 배열을 뒤에서부터 비교하며 병합
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1]; // nums1 값이 더 크면 뒤쪽에 복사
                p1--;
            } else {
                nums1[p] = nums2[p2]; // nums2 값이 더 크거나 같으면 복사
                p2--;
            }
            p--; // 병합된 배열의 위치 이동
        }

        // nums2에 남아 있는 요소 처리
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }       
    }
}