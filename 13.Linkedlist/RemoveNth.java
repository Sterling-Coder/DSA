public class RemoveNth {
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
        
        public void deleteNthFromEnd(int n) {
            int sz = 0;
            Node temp = head;
            while (temp != null) {  //size calculate
                temp = temp.next;
                sz++;
            }
            if(n == sz) {
                head = head.next; //firstElelemt Remove
                return;
            }
            //sz - n
            int i = 1;
            int iToFind = sz -n;
            Node prev = head;
            while (i < iToFind) {
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
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
            RemoveNth ll = new RemoveNth();
            ll.AddFirst(5);
            ll.AddFirst(4);
            ll.AddFirst(3);
            ll.AddFirst(2);
            ll.AddFirst(1);
            ll.print();
            ll.Reverse();
            ll.print();

            ll.deleteNthFromEnd(3);
            ll.print();
        }
    }
