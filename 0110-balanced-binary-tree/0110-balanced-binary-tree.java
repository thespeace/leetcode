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
    public boolean isBalanced(TreeNode root) {
        // -1 반환 시 불균형 트리로 간주
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        // Base case: 노드가 null이면 높이 0 반환
        if (node == null) return 0;

        // 왼쪽 서브트리의 높이 계산
        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1; // 불균형 트리 발견 시 종료

        // 오른쪽 서브트리의 높이 계산
        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1; // 불균형 트리 발견 시 종료

        // 현재 노드의 균형 상태 확인
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        // 균형 상태라면 현재 노드의 높이 반환
        return Math.max(leftHeight, rightHeight) + 1;
    }
}