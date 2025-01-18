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
    public int maxDepth(TreeNode root) {
        // 트리가 비어 있으면 깊이는 0
        if (root == null) return 0;

        // 큐를 사용한 BFS
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size(); // 현재 레벨의 노드 수
            depth++; // 레벨을 증가

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                // 왼쪽, 오른쪽 자식 노드를 큐에 추가
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }

        return depth;
    }
}