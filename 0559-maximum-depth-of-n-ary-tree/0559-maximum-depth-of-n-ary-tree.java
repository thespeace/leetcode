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
    public int maxDepth(Node root) {
        // 노드가 없으면 깊이 0 반환
        if (root == null) return 0;

        int maxDepth = 0;
        // 모든 자식 노드의 깊이를 탐색하여 최대값 갱신
        for (Node child : root.children) {
            maxDepth = Math.max(maxDepth, maxDepth(child));
        }

        // 현재 노드 포함하여 깊이 1 증가
        return maxDepth + 1;
    }
}