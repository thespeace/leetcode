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
    public int countNodes(TreeNode root) {
        if (root == null) return 0; // Base case: 노드가 없으면 0 반환

        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);

        // 왼쪽 높이와 오른쪽 높이가 같다면, 왼쪽 서브트리는 완전 이진 트리
        if (leftHeight == rightHeight) {
            return (1 << leftHeight) - 1; // 2^h - 1 공식 적용
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    // 왼쪽 서브트리의 높이 계산
    private int getLeftHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }

    // 오른쪽 서브트리의 높이 계산
    private int getRightHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.right;
        }
        return height;
    }
}