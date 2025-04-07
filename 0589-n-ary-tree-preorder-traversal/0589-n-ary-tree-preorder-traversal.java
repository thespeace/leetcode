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
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    // 전위 순회
    private void preorderHelper(Node node, List<Integer> result) {
        if (node == null) return;

        result.add(node.val); // 루트 처리

        for (Node child : node.children) { // 자식들을 순서대로 재귀 호출
            preorderHelper(child, result);
        }
    }
}