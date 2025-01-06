class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty())
                    return false;
                    
                Character pop =  stack.peek();

                if (pop == '(' && c == ')')
                    stack.pop();
                else if (pop == '{' && c == '}')
                    stack.pop();
                else if (pop == '[' && c == ']')
                    stack.pop();
                else
                    return false;
            }
        }

        return stack.isEmpty();
    }
}