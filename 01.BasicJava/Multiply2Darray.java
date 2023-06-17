public class Multiply2Darray {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][] = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr2[i][j] = 0;
                for (int k = 0; k < arr.length; k++) {
                    arr2[i][j] += arr[i][j] * arr1[i][j];
                }
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}