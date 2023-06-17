import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of a circle");
        try (Scanner sc = new Scanner(System.in)) {
            float r = sc.nextFloat();
            float Area;
            Area = 2 * 3.14f * r * r;   // f for float (Compiler always take decimal To double)
            System.out.println("Area of a cirle: " + Area);

            System.out.println("Enter the side of square");
            float a =  sc.nextFloat();
            float area;
            area = a * a;
            System.out.println("Area of square: " + area);
        }
    }
}