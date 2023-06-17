public class SpiralMatrix {
    public static void Sprial(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // TOP
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // Right
            for (int i = startRow + 1 ; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // Bottom
            for (int j = endCol - 1 ; j >= startCol; j--) {
                // if the the metrix is odd....To print out the centre array
                if(startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");

            }
            // Left
            for (int i = endRow - 1 ; i >= endRow; i--) {
                // if the the metrix is odd....To print out the centre array
                if(startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, }, { 5, 6, 7, 8, }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        Sprial(matrix);
    }
}
    






    
    //     for (int i = 0; i < 4; i++) {
    //         for (int j = 0; j < 4; j++) {
    //         //top
    //             if (i == 0 && j < 4) {
    //                 System.out.print(matrix[i][j] + " ");
    //             }
    //             //right
    //             if (i != 0 && i <= 3 && j == 3) {
    //                 System.out.print(matrix[i][j] + " ");
    //             }
    //             // //bottom
    //             // if (i == 3 && j <=3){
    //             //     System.out.print(matrix[i][j] + " ");

    //             // } 
    //             // //left
    //         //     if(i <=3 && j == 1) {
    //         //         System.out.print(matrix[i][j] + " ");
    //         //     }
    //         // }
    //     }
    // }