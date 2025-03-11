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
    public int sumOfLeftLeaves(TreeNode root) {
        // 재귀 X, Queue 이용해서 스택 오버 플로우 방지
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int sum = 0;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            // 왼쪽 자식이 있는 경우
            if (node.left != null) {
                // 왼쪽 자식이 잎 노드라면 더하기
                if (node.left.left == null && node.left.right == null) {
                    sum += node.left.val;
                } else {
                    queue.offer(node.left); // 왼쪽 자식이 있으면 큐에 추가
                }
            }
            
            // 오른쪽 자식도 큐에 추가
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return sum;
    }
}