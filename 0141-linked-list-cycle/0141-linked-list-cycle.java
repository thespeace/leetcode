/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // 노드가 없거나 하나일 경우 사이클 불가능
        }
        
        // 두 포인터 사용
        ListNode slow = head; // 느린 포인터
        ListNode fast = head; // 빠른 포인터
        
        while (fast != null && fast.next != null) {
            slow = slow.next; // 한 칸 이동
            fast = fast.next.next; // 두 칸 이동
            
            if (slow == fast) { // 두 포인터가 만나면 사이클 존재
                return true;
            }
        }
        
        return false; // fast가 null에 도달하면 사이클 없음
    }
}