                                    /*      IF ELSE STATEMENT IN A SINGLE LINE (TERNARY OPERATOR)
                                       -----> variable = condition? statement1: statement2; <-----    */
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        int num = 4;
        System.out.println("Your Number is 4");

        String type = (num%2 == 0)? "even": "odd";
        System.out.println(type);

        // 2nd

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Your Marks :");
            int Marks = sc.nextInt();

            String Name = (Marks >= 33)? "PASS": "FAIL";
            System.out.println(Name);
        }

    }
}
