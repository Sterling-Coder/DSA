import java.util.*;

public class Array_SubarrayPrefix {
    // Time Complexity😀 
    public static void prefix(int number[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum;

        int prefix[] = new int[number.length];
        // calculate prefix array
        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum Sum : " + maxsum);
    }

    public static void main(String[] args) {
        // Input Size of array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int number[] = new int[n];
        // input element in array
        System.out.println("Enter the element in array : ");
        for (int i = 0; i < number.length; i++) {
            int ele = sc.nextInt();
            number[i] = ele;
        }
        // Printing array..
        System.out.print("Array : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

        // Function Start

        prefix(number);
        sc.close();
    }
}
