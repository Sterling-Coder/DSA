public class Grids {
    public static int ways(int i, int j, int n , int m) {
        //Base base
        if(i == n-1 || j == m-1) { // for last cell
            return 1;
        } else if(i == n || j == m){ // corners
            return 0;
        }
        //Recursion
        int w1 = ways(i+1, j, n, m);
        int w2 = ways(i, j+1, n, m);
        return w1 + w2; // Total ways
    }
    public static void main(String[] args) {
        int n = 8; 
        int m = 8;
        System.out.println(ways(0, 0, n, m));
    }
}
