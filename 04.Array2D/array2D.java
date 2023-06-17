import java.util.*;

public class array2D {
  
  // searching element
  public static boolean Search(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found : (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("NOT FOUND");
        return false;
    }
  
    public static void main(String args[]) {
        int n = 3; //rows
        int m = 5; //cols
        int matrix[][] = new int [n][m];

        //Taking Input
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<n; i++) {
            System.out.println("Enter elements in Matrix " + i);
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt(); // elements in ith position
            }
        }

        //Printing Output
        System.out.println("Matrix :");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
      //taking input & call Funtion
        System.out.println("Enter element to find : ");
        int key = sc.nextInt();
        Search(matrix, key);
        sc.close();
    }
}