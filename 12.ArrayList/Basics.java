import java.util.*;
import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Arraylist :");
        System.out.println(list);

        // *******operations

        // get
        System.out.println("Enter index, to get an element(Starting with 0) :");
        int ele = sc.nextInt();
        Integer element = list.get(ele);
        System.out.println("The element at index (" + ele + ") " + "is " + element);

        // remove
        System.out.println("Enter index to remove an element :");
        int ele1 = sc.nextInt();
        list.remove(ele);
        System.out.println("Element Removed --> " + list);

        // set
        System.out.println("Enter an element :");
        int ele2 = sc.nextInt();
        System.out.println("Enter index to replace/set :");
        int pos = sc.nextInt();
        list.set(pos, ele2);
        System.out.println(list);

        // contains
        System.out.println("Enter element to search :");
        int n = sc.nextInt();
        System.out.println(list.contains(n));

        // add at perticular index
        System.out.println("Enter an element :");
        int ele3 = sc.nextInt();
        System.out.println("Enter index to Insert :");
        int pos1 = sc.nextInt();
        list.add(pos, ele3); // O(n)
        System.out.println(list);

        // size
        System.out.println("Size of an ArrayList is :");
        System.out.println(list.size());
        System.out.println("All Elements are :");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}