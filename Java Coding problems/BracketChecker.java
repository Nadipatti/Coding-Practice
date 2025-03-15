import java.util.Scanner;
import java.util.Stack;

public class BracketChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the expression with brackets
        String expression = sc.nextLine();
        
        // Check if the brackets are balanced
        if (areBracketsBalanced(expression)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }

        sc.close();
    }

    // Function to check if brackets are balanced
    public static boolean areBracketsBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        // Traverse through the expression
        for (int i = 0; i < expr.length(); i++) {
            char current = expr.charAt(i);

            // If the current character is an opening bracket, push it to the stack
            if (current == '(') {
                stack.push(current);
            } 
            // If it's a closing bracket
            else if (current == ')') {
                // If the stack is empty, there's no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                } 
                // Otherwise, pop the opening bracket from the stack
                stack.pop();
            }
        }

        // If the stack is empty, brackets are balanced
        return stack.isEmpty();
    }
}

