import java.util.*;

public class Loop3 {
    public static void main(String[] args) {
                                                      // DO While Loop
        int counter = 1;
        do {
            if( counter == 3) {
                break;
            }
            System.out.println("Hello World");
            counter++;
        } while (counter < 5);

        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Enter Your Number : ");
            int n = sc.nextInt();
            if (n%10 == 0) {
            break; // Use 'Continue' to skip 3 and Continue the code..
            }
            System.out.println("Number waas :" + n);
        } while (true);
        sc.close();
    }
}