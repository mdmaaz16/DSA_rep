package stack;
import java.util.*;
class reversepolish {
    public int evalRPN(String[] tokens) {
         Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
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
                        stack.push(a / b); // Integer division truncates towards zero
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
            }
        }
        
        return stack.pop(); // The final result
    }
    
    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    }