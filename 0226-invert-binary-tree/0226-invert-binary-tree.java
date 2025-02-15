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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null; // Base case

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); // 루트부터 시작

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll(); // 현재 노드 처리

            // 좌우 자식 노드 교환
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            // 다음 레벨 탐색을 위해 자식 노드를 큐에 추가
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

        return root; // 반전된 트리 반환
    }
}