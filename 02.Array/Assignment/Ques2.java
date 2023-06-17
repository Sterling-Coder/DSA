package Assignment;
import java.util.*;

public class Ques2 {

    public static int Binaryoperation(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid; 
            }
            if (key < number[mid]) {
                end = mid - 1; // left
            } else {
                start = mid + 1; // right
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("target :");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int number[] = { 1, 2, 3, 4, 5, 6, 7 };

       // System.out.println("Array :" + rotate(number));

        System.out.println("Index is : " + Binaryoperation(number, key) );
        sc.close();
    }
}