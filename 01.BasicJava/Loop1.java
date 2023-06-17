import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
                                                            // WHILE LOOP
         
        int counter = 0;
        while (counter < 5) { // IF we replace counter < 20 with True, then the loop will be infinite
            System.out.println("Hello Aman");
            counter++;
        }
        int num = 1;
        while (num < 11) {
            System.out.print(num);
            num++;
            System.out.println(" ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You Number : ");
        int Range = sc.nextInt();

        int Counter = 1;
        while (Counter <= Range) {
            System.out.print(Counter);
            Counter++;
        }
        sc.close();
    }
}
