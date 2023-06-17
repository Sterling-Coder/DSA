public class fIRSTsearchKey {
    
    static int fIRSsearchKey(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return fIRSsearchKey(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,5};

        fIRSsearchKey(arr, 3, 0);
    }
}