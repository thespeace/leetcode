/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    // 후위 순회
    private void postorderHelper(Node node, List<Integer> result) {
        if (node == null) return;

        // 모든 자식들을 먼저 순회
        for (Node child : node.children) {
            postorderHelper(child, result);
        }

        // 자식들 순회 후 현재 노드 처리
        result.add(node.val);
    }
}