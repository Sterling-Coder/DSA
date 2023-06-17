import java.util.Scanner;

public class Largest3Digit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Lets make Output Looks Gud
            System.out.println("1st Number :");
            int a = sc.nextInt();
            System.out.println("2nd Number :");
            int b = sc.nextInt();
            System.out.println("3rd Number :");
            int c = sc.nextInt();

            if (a > b && b < c) {
                System.out.println("Largest No. :" + a);
            } else if (b > c) {
                System.out.println("Largest No. :" + b);
            } else {
                System.out.println("Largest No. :" + c);
            }
        }
    }
}