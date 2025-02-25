import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //opening bracket
            if (ch == '{' || ch == '[' || ch == '(') {
                s.push(ch);
            } else {
                //closing bracket
                if (s.isEmpty()) {
                    return false;
                }
                //pair check
                if (s.peek() == '}' && ch == '{' || s.peek() == ']' && ch == '[' || s.peek() == ')' && ch == '(') { //peek() for top
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "()";   // Wah wrong output
        isValid(str);
        if (isValid(str)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
    }
}