class MyQueue {
    private Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();
    }

    // 요소를 큐의 끝에 추가 (O(n) - 재귀적 삽입)
    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }
        int top = stack.pop();
        push(x);
        stack.push(top);
    }

    // 큐의 맨 앞 요소 제거 (O(1))
    public int pop() {
        return stack.pop();
    }

    // 큐의 맨 앞 요소 조회 (O(1))
    public int peek() {
        return stack.peek();
    }

    // 큐가 비어 있는지 확인 (O(1))
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */