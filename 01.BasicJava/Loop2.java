public class Loop2 {
    public static void main(String[] args) {
                                                         //For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
        // Make a Square PATTERN '*'

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        // Making using while loop

        int i = 1;

        while (i <= 5) {
            System.out.println("******");    // hehe
            i++;
        }
    }
}
