public class BackTracArray {
    public static void ChangeArray(int arr[], int i) {
        if(i == arr.length) {
            return;
        }
        arr[i] = i+1;
        ChangeArray(arr, i+1);
        arr[i] = arr[i] - 2;
    }

    public static void print(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        ChangeArray(arr, 0);
        print(arr);
    }
}