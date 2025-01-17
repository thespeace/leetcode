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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        // 둘 다 null이면 동일
        if (p == null && q == null) return true;

        // 한쪽만 null이거나 값이 다르면 다름
        if (p == null || q == null || p.val != q.val) return false;

        // 좌측과 우측 서브트리를 재귀적으로 비교
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}