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
    public ListNode removeElements(ListNode head, int val) {
        // 더미 노드 생성 (head가 삭제될 경우 대비)
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next; // 현재 노드 삭제
            } else {
                prev = curr; // 이전 노드를 현재 노드로 이동
            }
            curr = curr.next; // 다음 노드 이동
        }

        return dummy.next; // 더미 노드의 다음 노드가 새로운 head
    }
}