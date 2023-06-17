public class QuickSort {
    public static void PrintArr(int arr[]) {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Quick_Sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        //pivot variable stores correct idx for pivot element
        int PIdx = Partion(arr, si, ei);
        Quick_Sort(arr, si, PIdx - 1); // Left
        Quick_Sort(arr, PIdx + 1, ei); // Right
    }

    public static int Partion(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; // makes space for elements smaller than pivot

        for (int j = si; j<ei; j++) {
            if(arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        //place pivot at correct position
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; //pivot's position need to change so (pivot = arr[i]) won't work
        arr[i] = temp;

        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        Quick_Sort(arr, 0, arr.length-1);
        PrintArr(arr);
    }
}