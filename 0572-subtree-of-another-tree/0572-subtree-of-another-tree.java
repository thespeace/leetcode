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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;

        // 현재 노드부터 시작해서 트리가 동일한지 확인
        if (isSameTree(root, subRoot)) return true;

        // 왼쪽 또는 오른쪽 자식에서 서브트리인 경우를 재귀적으로 탐색
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode s, TreeNode t) {
        // 둘 다 null이면 같음
        if (s == null && t == null) return true;

        // 하나만 null이거나 값이 다르면 다름
        if (s == null || t == null || s.val != t.val) return false;

        // 왼쪽과 오른쪽 서브트리도 재귀적으로 확인
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}