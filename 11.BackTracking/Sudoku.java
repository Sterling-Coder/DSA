public class Sudoku {

    public static boolean isSafe(int Sudoku[][], int row, int col, int Digit) {
        // row 
        for (int i = 0; i<9; i++) {
            if(Sudoku[row][i] == Digit) {
                return false;
            }
        }
        // col
        for (int j = 0; j<9; j++) {
            if(Sudoku[j][col] == Digit) {
                return false;
            }
        }
        //grid
        int sr = (row/3)*3; //startRow
        int sc = (col/3)*3; //StarCol
        // 3x3 grid
        for (int i = sr; i<sr+3; i++) {
            for( int j =sc; j<sc+3; j++) {
                if(Sudoku[i][j] == Digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean SudokuCheck(int Sudoku[][], int row, int col) {
        // Base Case
        if (row == 9) {
            return true;
        }
        // Recursion
        int newRow = row, newCol = col + 1;
        if (newCol == 9) {
            newRow = row + 1;
            newCol = 0;
        }

        if (Sudoku[row][col] != 0) {
            return SudokuCheck(Sudoku, newRow, newCol);
        }

        for (int Digit = 1; Digit <=9; Digit++) {
            if (isSafe(Sudoku, row, col, Digit)) {
                Sudoku[row][col] = Digit;
                if (SudokuCheck(Sudoku, newRow, newCol)) {
                    return true;
                }
                Sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoko(int Sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(Sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int Sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        if (SudokuCheck(Sudoku, 0, 0)) {
            System.out.println("Solution Exist");
            printSudoko(Sudoku);
        } else
            System.out.println("Solution doest not exist");
    }
}