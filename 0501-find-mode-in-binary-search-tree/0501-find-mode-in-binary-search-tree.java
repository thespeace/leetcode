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
    private Integer prev = null;
    private int count = 0;
    private int maxCount = 0;
    private List<Integer> modes = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);
        return modes.stream().mapToInt(i -> i).toArray();
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        // Left
        inorder(node.left);

        // Root 처리 (현재 값 확인)
        if (prev != null && node.val == prev) {
            count++;  // 이전 값과 같으면 빈도 증가
        } else {
            count = 1;  // 새로운 값이면 빈도 초기화
        }

        // 최빈값 갱신
        if (count > maxCount) {
            maxCount = count;
            modes.clear();
            modes.add(node.val);
        } else if (count == maxCount) {
            modes.add(node.val);
        }

        prev = node.val; // 이전 값 업데이트

        // Right
        inorder(node.right);
    }
}