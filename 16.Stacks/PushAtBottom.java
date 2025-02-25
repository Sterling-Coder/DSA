                                                                                           // Q) Push at the bottom of the Stack

import java.util.*;

public class PushAtBottom {

    public static void PushAtBotton(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBotton(s, data);
        s.push(top);
        }
 
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);

        PushAtBotton(s, 4);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
