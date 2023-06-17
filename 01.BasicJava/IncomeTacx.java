// import java.util.Scanner;

// public class IncomeTacx {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             float Income = sc.nextFloat();
//             float Tax1 = Income* 20 / 100;
//             float Tax2 = Income* 30 / 100;

//             if (Income < 500000) {
//                 System.out.println("0% Tax : 0");
//             } else if (500000 <= Income && Income <= 1000000) {
//                 System.out.println("20% Tax : " + Tax1);
//             } else if (Income > 1000000) {
//                 System.out.println("30% Tax : " + Tax2);
//             } else
//                 System.out.println("Invalid Income Entered");
//         }
//     }
// }

// Let's try to make code using int attribute

import java.util.Scanner;

public class IncomeTacx {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int Income = sc.nextInt();
            int Tax;

            if (Income < 500000) {
                Tax = 0;
            } else if (500000 >= Income && Income < 1000000) {
                Tax = (int) (Income * 0.2);
            } else {
                Tax = (int) (Income * 0.3);
            }
            System.out.println("Your tax is :" + Tax);
        }
    }
}