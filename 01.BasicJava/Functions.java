import java.util.*;

public class Functions {

    public static int printHelloWorld() {
        System.out.println("Hello World");
        return 0;
    }

    public static int Calculatesum(int num1 , int num2) { // Parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        printHelloWorld(); // Function call

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Calculatesum(a, b); // arguments or actual parameters
        System.out.println("Sum is :" + sum);
        sc.close();
    }
}
