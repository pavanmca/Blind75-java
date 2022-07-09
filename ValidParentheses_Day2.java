import java.util.Stack;

public class ValidParentheses_Day2 {
    public static void main(String[] args) {
        String s1 = "()[]{}";
        System.out.println(isValid(s1));
        String s2 = "()[]{";
        System.out.println(isValid(s2));
    }

    // n -> length of input s string
    // Time Complexity - O(n)
    // Space Complexity - O(n)
    public static boolean isValid(String s) {
        // use stack to store opening brackets
        Stack<Character> charStack = new Stack<>();

        for (char currentChar : s.toCharArray()) {
            // push to stck if current char is one of open brackets
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                charStack.push(currentChar);
            } else { // closing parenthesis
                     // if stack is empty-> it means you don't have correpsonding opening bracket OR
                     // if current bracket does not make a pair with last stored value in stack->
                     // return false
                if (charStack.isEmpty() || !isPair(charStack.peek(), currentChar)) {
                    return false;
                }
                charStack.pop();
            }
        }
        // if after processing all chars stack is empty then true, else false
        return charStack.isEmpty();
    }

    // function to check the pairs of brackets
    private static boolean isPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }
}
