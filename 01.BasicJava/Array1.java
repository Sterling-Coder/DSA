// import java.util.*;

// public class Array1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Array Size :");
//         int n = sc.nextInt();

//         int Array[] = new int[n];
//         System.out.println("Enter elements of Array :");
//         for(int i = 0; i <= Array.length; i++) {
//             Array[i] = sc.nextInt();
//             System.out.println(Array[i]);
//         }
//     }
// }

// liner search

import java.util.*;

public class Array1 {

    static int Search(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (key == number[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 1, 3, 5, 7, 10 };
        System.out.println("Enter Number to be find in array");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int index = Search(number, key);

        if (index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println("Found");
        }
        sc.close();
    }
}
