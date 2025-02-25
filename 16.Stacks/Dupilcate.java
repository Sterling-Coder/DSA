import java.util.*;  //O(n)

public class Dupilcate {
    public static boolean isDupilcate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //Valid String
        String str = "((a+b))"; // true
        String str1 = "(a+b)"; // false

        System.out.println(isDupilcate(str));
        System.out.println(isDupilcate(str1));

    }
}
