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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode current = head;
        
        // 연결 리스트 순회
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // 중복된 값인 경우: 다음 노드를 건너뜀
                current.next = current.next.next;
            } else {
                // 중복이 아닌 경우: 다음 노드로 이동
                current = current.next;
            }
        }

        return head;
    }
}