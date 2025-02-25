public class StackLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data; 
            this.next = null;
        }
    }

    static class Stackl {
        static Node head = null;

        //isEmpty
        boolean isEmpty() {
            return head == null;
        }

        //push
        public void push(int data) {
            Node newnode = new Node(data);
            if (isEmpty()) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        //pop
        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public int peek() {
            if (isEmpty()) {
            return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stackl s = new Stackl();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}