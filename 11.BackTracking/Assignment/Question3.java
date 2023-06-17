// package Assignment;

// public class Question3 {
//     public static void Knight(int board[][], int row) {
//         if(row == board.length) {
//             print(board);
//             return;
//         }
//         if(movement(board, 0, 0)) {
            

//         }
//     }
//     public static void movement(int board[][], int row, int col) {
//         int count = 0;
//         //up R
//         for (int i = row - 2 , j = col + 1; i<=0 && j<=0; i--, j++) {
//             System.out.println(count);
//             count++;
//             return;
//         }
//         //up L
//         for (int i = row - 2 , j = col -1; i<=0 && j<=0; i--, j--) {
//             System.out.println(count);
//             count++;
//             return;
//         }
//         //right up
//         for (int i = row + 1, j = col + 2; i<=0 && j<=0; i++, j++) {
//             System.out.println(count);
//             count ++;
//             return;
//         }
//         //left up
//         for(int i = row +1, j= col - 2; i<=0 && j<0; i++, j--) {
//             System.out.println(count);
//             count++;
//             return;
//         }
//         //Down R
//         for(int i = row + 2, j = col + 1; i<=board.length && j<=board[0].length; i++, j++) {
//             System.out.println(count);
//             count++;
//             return;
//         }
//         // Down L
//         for(int i = row + 2, j = col - 1; i<=board.length && j<=board[0].length; i++, j--) {
//             System.out.println(count);
//             count++;
//             return;
//         }
//         //right down 
//         for(int i = row +1, j= col + 2; i<=0 && j<0; i++, j++) {
//             System.out.println(count);
//             count++;
//             return;
//         }
//         // left down
//         for(int i = row +1, j= col - 2; i<=0 && j<0; i++, j--) {
//             System.out.println(count);
//             count++;
//             return;
//         }
//     }
//     public static void print(int board[][]) {
//         for (int i =0; i<board.length; i++) {
//             for (int j =0; j<board[0].length; j++) {
//                 System.out.println(board[i][j]);
//             }
//         }
//     }
//      public static void main(String[] args) {
//         int n= 8;
//         int board[][] = new int[n][n];

//         Knight(board, 0);
//         print(board);
//      }
// }