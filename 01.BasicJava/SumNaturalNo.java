import java.util.Scanner;

public class SumNaturalNo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;
            for (int i=1; i<=n; i++) {
                sum = sum + i;
            }
            System.out.println(sum);

            // using while Loop

            System.out.println("Enter Number : ");
            int counter = sc.nextInt();
            int Sum = 0;
            int num = 0;

            while (num <= counter) {
                Sum += num; // Sum = Sum + num;
                num++;
            }
                System.out.println(Sum);
        }
    }
}