import java.util.*;

public class Integer {
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 0;

    public static void main(String[] args) {
        System.out.println("How many Integer you want :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Enter your Numbers :");
        int sumeven = 0;
        int sumodd = 0;
        for(int i=0; i<num; i++ ) {
            int n = sc.nextInt();
            if (n%2 == 0) {
                sumeven += n;
            } else {
                sumodd += n;
            }
        }
        System.out.println("Total sum of even number" + sumeven);
        System.out.println("Total sum of odd number" + sumodd);
        sc.close();
    }

    public static int parseInt(String str) {
        return 0;
    }
}