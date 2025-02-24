/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) { // 종료 조건: left == right
            int mid = left + (right - left) / 2; // 오버플로우 방지한 중간값 계산
            if (isBadVersion(mid)) {
                right = mid; // 첫 번째 bad version을 찾아야 하므로 왼쪽 범위 축소
            } else {
                left = mid + 1; // mid가 정상 버전이면 오른쪽 범위 축소
            }
        }

        return left;
    }
}