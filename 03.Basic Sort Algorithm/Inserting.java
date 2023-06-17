public class Inserting {
    public static void inverting(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding currect option to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //inserting
            arr[prev + 1] = curr;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        //output not showing😓
        inverting(arr);
    }
}