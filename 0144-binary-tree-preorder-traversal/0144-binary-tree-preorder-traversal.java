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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();

            // 현재 노드 값 추가
            result.add(current.val);
            // 오른쪽 자식 먼저 추가 (스택 구조로 인해 오른쪽이 나중에 처리됨)
            if (current.right != null) stack.push(current.right);
            // 왼쪽 자식 추가
            if (current.left != null) stack.push(current.left);
        }
        
        return result;
    }
}