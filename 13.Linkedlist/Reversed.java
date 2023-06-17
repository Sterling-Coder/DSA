public class Reversed {
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

    //reverse
    public void Reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        }
        head = prev;
    }
    
    //print
    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
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
        Reversed ll = new Reversed();
        ll.AddFirst(5);
        ll.AddFirst(4);
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.print();
        ll.Reverse();

        ll.print();
    }
}