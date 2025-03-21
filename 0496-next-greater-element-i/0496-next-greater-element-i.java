class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        // nums2를 순회하며 다음 큰 요소를 찾음
        for (int num : nums2) {
            // 현재 숫자가 스택 top보다 크다면, 해당 원소의 다음 큰 숫자로 기록
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreater.put(stack.pop(), num);
            }
            // 현재 숫자를 스택에 push (뒤에서 볼 숫자)
            stack.push(num);
        }
        
        // nums1의 요소에 대해 nextGreater에서 조회
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater.getOrDefault(nums1[i], -1);
        }
        
        return result;
    }
}