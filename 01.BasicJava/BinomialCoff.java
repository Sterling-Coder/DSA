import java.util.*;

public class BinomialCoff {
    public static int Coff(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int Ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();

        System.out.println("Enter value of r");
        int r = sc.nextInt();

        int a = Coff(n);
        int b = Coff(r);
        int c = Coff(n - r);

        Ans = a / (b * c);

        System.out.println(Ans);
        sc.close();
    }
}
