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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        
        dfs(root, "", result);
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        if (node == null) return;

        // 현재 노드를 경로에 추가
        path += node.val;

        // 리프 노드라면 결과 리스트에 추가
        if (node.left == null && node.right == null) {
            result.add(path);
        } else {
            // 자식이 있으면 "->" 추가 후 재귀 호출
            path += "->";
            dfs(node.left, path, result);
            dfs(node.right, path, result);
        }
    }
}