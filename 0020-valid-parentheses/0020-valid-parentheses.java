class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                // If we see a closing bracket but stack is empty -> invalid
                if (stack.isEmpty()) {
                    return false;
                }

                // Check for matching pairs without messy conditional chains
                char top = stack.peek();
                if ((ch == ')' && top == '(') || 
                    (ch == ']' && top == '[') || 
                    (ch == '}' && top == '{')) {
                    stack.pop(); // Valid match, safe to pop
                } else {
                    return false; // Mismatch found
                }
            }
        }

        return stack.isEmpty();
    }
}