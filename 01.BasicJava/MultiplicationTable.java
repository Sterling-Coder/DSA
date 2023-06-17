import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int table;

        System.out.println("Enter your number :");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            table = i * n;
            System.out.println(i + "*" + n + "=" + table);
        }
        sc.close();
    }
}