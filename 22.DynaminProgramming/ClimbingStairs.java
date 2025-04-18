import java.util.*;

public class ClimbingStairs {

    public static int rec_ways(int n){ // O(n^2)
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n < 0 ) {
            return 0;
        }

        return rec_ways(n-1) + rec_ways(n-2);
    }

    public static int memoization_ways(int f[], int n) { //0(n)
        if ( n == 0 || n == 1) {
            return 1;
        }
        if (f[n] !=  -1) { // as we fill -1
            return f[n];
        }
        f[n] = memoization_ways(f, n-1) + memoization_ways(f, n-2);
        return f[n];
    }

    public static int tabulation_ways(int n) { // if 3 step allowed
        int dp[] = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if( i == 1) {
                dp[i] = dp[i-1] + 0;
            }
            dp[i] = dp[i-1] + dp[i-2]; // + dp[i-3];
        }
        return dp[n];
    }

   public static void main(String[] args) {
    int n = 5;
    int f[] = new int[n+1]; // 0 0 0 0 array
    Arrays.fill(f, -1); // -1 -1 -1 -1 array fill
    System.out.println(rec_ways(n));
    System.out.println(memoization_ways(f, n));
    System.out.println(tabulation_ways(n));
   } 
}
