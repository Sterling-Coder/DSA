public class ZigZag {
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

     //AddFirst
    public void addFirst(int data) {
        Node newnode = new Node(data); // Step1 - create new node
        size++;
        if (head == null) {
           head = tail = newnode;
           return;
        }
        newnode.next = head;
        head = newnode;
    }

     //Zig Zag
     public void zigzag() {
        //mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2ns Hal
        Node curr = mid.next;
        mid.next = null;
        Node prev= null;
        Node next;

        while(curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alt marge - zig zag merge
        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            
            left = nextL;
            right = nextR;
        }
     }

     //print
     public void print() {
        if (head == null) {
            System.out.println("LiskedList is empty");
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
    }
    System.out.print("null");
    System.out.println();
}
    public static void main(String[] args) {
        ZigZag ll = new ZigZag();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        ll.print();
        ll.zigzag();
        ll.print();
    }
}
