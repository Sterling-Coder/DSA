import java.util.*;

public class NestedCatch {
    // public static void main(String[] args) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0, z;
        try {
            System.out.println("enter two integers");
            x = sc.nextInt();
            y = sc.nextInt();
        } catch (Exception e) {
            try {
                System.out.println("enter two integers");
                Scanner sa = new Scanner(System.in);
                x = sa.nextInt();
                y = sa.nextInt();
                sa.close();
            } catch (Exception f) {
                System.out.println("terminating program");
            }
        } finally {
            z = x * y;
            System.out.println("the product of two integers is : " + z);
        }
        sc.close();
    }
}