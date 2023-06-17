public class Palindrome {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // AddFirst
    public void AddFirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    // find middle
    public Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1 (turtle)
            fast = fast.next.next; // +2 (hare)
        }
        return slow;
    }

    // Palindrome
    public boolean CheckPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step1 - find mid
        Node midNode = findMiddle(head);

        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half
        Node left = head;

        // step3 - check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // print
    public void print() {
        if (head == null) {
            System.out.println("LiskedList is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        Palindrome ll = new Palindrome();
        ll.AddFirst(5);
        ll.AddFirst(4);
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.print();
        
        System.out.println(ll.CheckPalindrome());
    }
}