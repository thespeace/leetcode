class MyStack {

    private Queue<Integer> queue; // 큐 1개만 사용

    public MyStack() {
        queue = new LinkedList<>();
    }

    // 요소를 큐에 삽입하면서 스택 순서를 유지
    public void push(int x) {
        queue.add(x); // 새로운 요소 삽입
        int size = queue.size();
        // 새로 추가된 요소를 큐의 앞쪽으로 이동시켜 LIFO 구조 유지
        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.poll()); // 기존 요소를 뒤로 이동
        }
    }

    // 스택의 최상단 요소 제거 (큐의 front 요소 반환 후 제거)
    public int pop() {
        return queue.poll(); // 가장 앞에 있는 요소 반환 후 제거
    }

    // 스택의 최상단 요소 반환 (제거 X)
    public int top() {
        return queue.peek(); // 가장 앞에 있는 요소 반환 (삭제 없음)
    }

    // 스택이 비어있는지 확인
    public boolean empty() {
        return queue.isEmpty(); // 큐가 비어있으면 true 반환
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */