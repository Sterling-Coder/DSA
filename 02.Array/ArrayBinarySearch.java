import java.util.*;

public class ArrayBinarySearch {

    public static int Binarysearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
            while(start <= end) {
            int mid = (start+end)/2;
            if(number[mid] == key) {
                return mid;
            }
            if(number[mid] < key){ // right
                start = mid + 1;
            } else {
                end = mid - 1; // left
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {1,3,5,7,9,11,13};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        
        System.out.println("The index of array : " + Binarysearch(number, key));
        sc.close();
    }
}