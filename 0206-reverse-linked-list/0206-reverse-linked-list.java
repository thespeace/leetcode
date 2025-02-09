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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;  // 이전 노드를 저장할 포인터
        ListNode curr = head;  // 현재 노드를 저장할 포인터
        
        while (curr != null) {
            ListNode next = curr.next; // 다음 노드를 미리 저장
            curr.next = prev;          // 현재 노드의 방향을 뒤집음
            prev = curr;               // prev를 현재 노드로 이동
            curr = next;               // curr를 다음 노드로 이동
        }

        return prev; // 역순 리스트의 새로운 head
    }
}