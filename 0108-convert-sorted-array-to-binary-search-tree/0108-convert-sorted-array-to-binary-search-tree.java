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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int left, int right) {
        // Base case: 범위가 유효하지 않으면 null 반환
        if (left > right) return null;

        // 중간값 계산
        int mid = left + (right - left) / 2;

        // 중간값으로 현재 노드 생성
        TreeNode root = new TreeNode(nums[mid]);

        // 재귀적으로 왼쪽, 오른쪽 서브트리 생성
        root.left = buildTree(nums, left, mid - 1);
        root.right = buildTree(nums, mid + 1, right);

        return root;
    }
}