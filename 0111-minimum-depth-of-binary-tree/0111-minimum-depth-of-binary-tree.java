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
    public int minDepth(TreeNode root) {
        // Base case: 트리가 비어있으면 깊이 0 반환
        if (root == null) return 0;

        // 왼쪽과 오른쪽 서브트리의 최소 깊이 계산
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        // 한쪽 서브트리가 없는 경우, 다른 쪽 서브트리의 깊이 사용
        if (root.left == null) return rightDepth + 1;
        if (root.right == null) return leftDepth + 1;

        // 둘 다 존재하면 최소 깊이 반환
        return Math.min(leftDepth, rightDepth) + 1;
    }
}