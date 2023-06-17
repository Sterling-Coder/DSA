package Assignment;

public class Question_1 {
    public static void Searching(int arr[], int key, int i) {
        //base case
        if(i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        //kaam
        Searching(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        Searching(arr, 2, 0);
        System.out.println();
    }
}
