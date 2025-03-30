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
    private int maxDiameter = 0; // 트리의 최대 지름 저장

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root); // 재귀적으로 깊이를 계산하며 지름을 갱신
        return maxDiameter;
    }

    private int depth(TreeNode node) {
        if (node == null) return 0; // 노드가 없으면 깊이 0
        
        // 왼쪽과 오른쪽 서브트리의 최대 깊이 계산
        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);
        
        // 현재 노드를 거치는 경로의 길이 계산 (왼쪽 깊이 + 오른쪽 깊이)
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);
        
        // 현재 노드의 깊이 리턴 (자식 중 더 깊은 쪽 + 1)
        return Math.max(leftDepth, rightDepth) + 1;
    }
}