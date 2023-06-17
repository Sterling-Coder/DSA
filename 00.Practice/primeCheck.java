import java.util.*;

public class primeCheck {
    public static boolean primecheck(int num) {
        if (num == 2) {
            System.out.println("Prime Number");
        } else {
            for (int i = 3; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter numeber to check prime :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        
        if ( primecheck(num) == true) {
            System.out.println("Prime Numeber");
        } else {
            System.out.println("Not a prime number");
        }
        sc.close();
    }
}