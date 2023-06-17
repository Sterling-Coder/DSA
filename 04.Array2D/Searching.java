public class Searching {
    public static int staircaseSearch(int matrix[][], int key) {
        for (int i = 0; i< matrix.length; i++) {
            for (int j = 0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("(" + i + "," + j + ")");
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,39,37,48},
                          {32,33,39,50}};
        int key = 37;
        staircaseSearch(matrix,key);

    }
}
