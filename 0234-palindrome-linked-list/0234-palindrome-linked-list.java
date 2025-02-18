/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // 중간 노드 찾기 (slow: 중간, fast: 끝)
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 후반부 리스트 뒤집기
        ListNode secondHalf = reverse(slow);
        ListNode firstHalf = head;
        
        // 앞부분과 뒤집힌 후반부 비교
        ListNode copy = secondHalf; // 나중에 리스트 복구용
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // 원래 리스트로 복구 (필요 시)
        reverse(copy);
        return true;
    }

    // 연결 리스트 뒤집기
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}