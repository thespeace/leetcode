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
    private int totalTilt = 0;  // 전체 기울기 합

    public int findTilt(TreeNode root) {
        calculateSum(root);
        return totalTilt;
    }

    private int calculateSum(TreeNode node) {
        if (node == null) return 0;  // Base case: null 노드는 합 0
        
        // 왼쪽과 오른쪽 서브트리 합 계산
        int leftSum = calculateSum(node.left);
        int rightSum = calculateSum(node.right);
        
        // 현재 노드의 기울기 계산
        int tilt = Math.abs(leftSum - rightSum);
        totalTilt += tilt;  // 전체 기울기 합에 추가
        
        // 현재 노드 포함한 전체 서브트리 합 반환
        return leftSum + rightSum + node.val;
    }
}
