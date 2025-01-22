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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Base case: 트리가 비어있으면 false 반환
        if (root == null) return false;

        // 리프 노드에 도달했을 때, 남은 합이 0이면 true 반환
        if (root.left == null && root.right == null) {
            return targetSum - root.val == 0;
        }

        // 왼쪽과 오른쪽 서브트리에서 경로를 재귀적으로 탐색
        return hasPathSum(root.left, targetSum - root.val) ||
               hasPathSum(root.right, targetSum - root.val);
    }
}