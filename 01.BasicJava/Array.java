import java.util.*;

public class Array {
    public static void main(String[] args) {
        int number[] = new int[50];
        // int cool[] = {1,2,3}; // bY this it make an array of 3
        number[0] = 4;
        number[1] = 5;

        // if we also print out the length of array

        System.out.println("lengh of array :" + number.length);
        

        Scanner sc = new Scanner(System.in);
        number[3] = sc.nextInt();
        number[4] = sc.nextInt();

        System.out.println("1st Number :" + number[3]);
        System.out.println("2nd Number :" + number[4]);

        number[4] = number[4] + 1; // we can also update the number

        System.out.println(number[4]);
        sc.close();
    }

    public static void sort(int[][] activities, Comparator<Object> comparingDouble) {
    }

    public static void sort(int[] b) {
    }
}