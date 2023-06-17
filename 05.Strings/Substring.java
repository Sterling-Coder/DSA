import java.util.*;

public class Substring {
    public static void substr(String str,int  n ,int  m) {
        for (int i = n; i <= m; i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello Aman";
        int n = sc.nextInt();
        int m = sc.nextInt();

        
        substr(str, n, m);
        sc.close();
    }
}