import java.util.Stack;

public class stack01 {
    public static String smallestBinaryString(String S) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : S.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == '1' && ch == '0') {
                stack.pop(); // Remove '1'
            } else {
                stack.push(ch);
            }
        }
        
        // Convert the stack back to a string
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        
        return result.toString();
        
}
public static void main(String[] args) {
    String S = "1100101";
    System.out.println(smallestBinaryString(S));
}
}