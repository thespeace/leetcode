/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int minDiff = Integer.MAX_VALUE; // 최소 차이를 저장
    private Integer prev = null; // 이전 노드 값을 저장 (처음에는 null)

    public int getMinimumDifference(TreeNode root) {
        inorder(root); // 중위 순회 수행
        return minDiff; // 최소 차이 반환
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        // 왼쪽 서브트리 탐색
        inorder(node.left);

        // 현재 노드와 이전 노드의 값 차이를 계산하여 최소값 갱신
        if (prev != null) {
            minDiff = Math.min(minDiff, node.val - prev);
        }
        prev = node.val; // 이전 노드 값을 현재 노드 값으로 업데이트

        // 오른쪽 서브트리 탐색
        inorder(node.right);
    }
}