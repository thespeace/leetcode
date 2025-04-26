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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return dfs(root, set, k);
    }

    private boolean dfs(TreeNode node, Set<Integer> set, int k) {
        if (node == null) return false;

        // k - node.val이 이미 등장한 적이 있으면, 찾은 것
        if (set.contains(k - node.val)) {
            return true;
        }

        // 현재 값 저장
        set.add(node.val);

        // 왼쪽과 오른쪽 모두 재귀적으로 탐색
        return dfs(node.left, set, k) || dfs(node.right, set, k);
    }
}