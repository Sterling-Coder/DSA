public class MergeSortLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
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

    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {  //Base Case
            return head;
        }
        //find mid
        Node slow = head;
        Node fast = head.next;
        Node mid;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        mid = slow;

    //right & left MS
    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);

    //merge
    return merge(newLeft , newRight);
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
        MergeSortLL ll = new MergeSortLL();
        ll.addFirst(5);
        ll.addFirst(9);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(1);

        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();

    }
}