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
    public boolean isSymmetric(TreeNode root) {
        // 루트가 null이면 대칭
        if (root == null) return true;

        // 큐를 사용해 대칭 확인
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            TreeNode t1 = queue.poll(); // 왼쪽 서브트리 노드
            TreeNode t2 = queue.poll(); // 오른쪽 서브트리 노드

            // 둘 다 null이면 대칭 -> 다음 노드로
            if (t1 == null && t2 == null) continue;

            // 한쪽만 null이거나 값이 다르면 비대칭
            if (t1 == null || t2 == null || t1.val != t2.val) return false;

            // 왼쪽의 왼쪽 + 오른쪽의 오른쪽, 왼쪽의 오른쪽 + 오른쪽의 왼쪽 추가
            queue.add(t1.left);
            queue.add(t2.right);
            queue.add(t1.right);
            queue.add(t2.left);
        }

        return true; // 모두 통과하면 대칭        
    }
}