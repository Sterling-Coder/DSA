public class RotatedSortedArray {
    public static int Searching(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si)/2;
        if (arr[mid] == target) {
            return mid;
        }

        // mid on line 1
        if (arr[si] <= arr[mid]) {
            // go left
            if(arr[si] <= target && target <= arr[mid]) {
                return Searching(arr, target, si, mid-1);
            } else { // go right
                return Searching(arr, target, mid + 1, ei);
            }
        }

        // mid on line 2
        else {
            // go right
            if (arr[mid] <= target && target <= arr[ei]) {
                return Searching(arr, target, mid + 1, ei);
            } else { // go left
                return Searching(arr, target, si, mid - 1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 7;
        System.out.println(Searching(arr, target, 0, arr.length-1));
    }
}