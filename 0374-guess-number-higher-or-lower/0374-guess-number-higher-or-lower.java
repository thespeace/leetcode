/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        // 이진 탐색 활용
        int left = 1, right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid);

            if (result == 0) return mid;  // 정답 찾음
            else if (result == -1) right = mid - 1;  // pick이 더 작은 경우
            else left = mid + 1;  // pick이 더 큰 경우
        }

        return -1;  // 이론상 실행될 일 없음
    }
}