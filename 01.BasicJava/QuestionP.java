import java.util.*;

public class QuestionP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do {
            System.out.println("Enter your Number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }
            System.out.println("Do you want to continue? Type 1 (YES) , 0 (NO)");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Sum of Even Number : "+ evensum);
        System.out.println("Sum of Odd Number : " + oddsum);
        sc.close();
    }
}