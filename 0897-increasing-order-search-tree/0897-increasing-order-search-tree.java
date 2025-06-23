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
    private TreeNode prev = null;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);  // 더미 노드 (시작점)
        prev = dummy;

        inorder(root);

        return dummy.right;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        node.left = null;         // 왼쪽 자식 제거
        prev.right = node;        // 이전 노드의 오른쪽에 연결
        prev = node;              // 이전 노드 갱신

        inorder(node.right);
    }
}