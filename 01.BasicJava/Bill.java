import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Cost of Pencil : ");
            float a = sc.nextFloat();
            System.out.println("Enter Cost of Pen : ");
            float b = sc.nextFloat();
            System.out.println("Enter Cost of Eraser : ");
            float c = sc.nextFloat();

            System.out.println("Pencil :" + a);

            System.out.println("Pen :" + b);
            System.out.println("Eraser :" + c);

            float sum = a + b + c;
            System.out.println("Total :" + sum);

            float GST = sum * 18 / 100;
            System.out.println("18% GST :" + GST);

            float Final = sum + GST;
            System.out.println("TOTAL :" + Final);
        }
    }
}