import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("Prime Number");
        } else {
            boolean isPrime = true; 
            for (int i = 2; i <= Math.sqrt(n); i++) {  // we can use n-1  in replace of Maths.sqrt(n)
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a Prime Number");
            }
            sc.close();
        }
    }
}