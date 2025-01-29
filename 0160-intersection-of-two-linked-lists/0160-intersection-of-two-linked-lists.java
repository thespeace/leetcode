/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        // 투 포인터 활용
        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {
            // 한쪽 리스트 끝에 도달하면 반대 리스트의 head로 이동
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }

        return pA; // 교차점 또는 null 반환
    }
}