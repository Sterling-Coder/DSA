public class lASTsearchKey {
    static int lASsearchKey(int arr[], int key, int i ) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lASsearchKey(arr, key, i-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,5};

        lASsearchKey(arr, 2, arr.length -1);
    }
}
