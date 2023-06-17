public class LinkedList {
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

        //Add First
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

        //Add last
        public void addLast(int data) {
            Node newnode = new Node(data); // Step1 - create new node
            size++;
            if (head == null) {
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }

        //Add Middle
        public void addMiddle(int idx, int data) {
            if (idx == 0) {
                addFirst(data);
                return;
            }
            Node newnode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;
            while (i < idx -1) {
                temp = temp.next;
                i++;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }

        //remove First
        public int removeFirst() {
            if (size == 0) {
                System.out.println("Linked list is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                head = tail = null;
                int val = head.data;
                size = 0;
                head = head.next;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        //remove Last
        public int removeLast() {
            if (size == 0) {
                System.out.println("Linked list is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            Node temp = head;
            while (temp.next != tail) { // for (int i = 0; i < size - 2; i++)
                temp = temp.next;
            }
            int val = tail.data;
            temp.next = null;
            tail = temp;
            size--;
            return val;
        }

        //search
        public int search(int key) {
            Node temp = head;
            for(int i = 0; i < size - 1; i++) {  // while (temp != null)
                temp = temp.next;
                if(temp.data == key) {
                    return 1; // return i for position
                }
            }
            return -1;
        }

        //search (recursive)
        public int helper(Node head, int key) {
            if (head == null) {
                return -1;
            }
            if (head.data == key) {
                return 0;
            }
            int idx = helper(head.next, key);
            if (idx == -1) {
                return -1;
            }
            return idx + 1;
        }

        public int recursiveSearch(int key) {
            return helper(head, key);
        }

        //print
        public void print() {
            if (head == null) {
                System.out.println("Linkedlist is empty");
                return;
            }
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        
        ll.addMiddle(1, 0); // HEHE
        ll.print();

        // System.out.println(ll.size);

        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();

        if (ll.search(1) == 1) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        System.out.println(ll.recursiveSearch(2));
        System.out.println(ll.recursiveSearch(9));
    }
}