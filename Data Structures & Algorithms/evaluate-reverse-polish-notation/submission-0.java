class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            try {
                // 1. Try to convert the token to a number. 
                // If it succeeds, push it to the stack.
                int num = Integer.parseInt(token);
                stack.push(num);
            } catch (NumberFormatException e) {
                // 2. If parsing fails, it's an operator (+, -, *, /)
                // Pop the two operands (Note the order: second popped is left operand)
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b); // Java division truncates toward zero by default
                        break;
                }
            }
        }
        
        // The final remaining element in the stack is the result
        return stack.pop();
    }
}