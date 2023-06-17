import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {  // sc.close(); will also close the sc !
            String name = sc.nextLine();
            System.out.println(name);
        }
    } 
}
