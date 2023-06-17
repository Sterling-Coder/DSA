import java.util.*;

public class factorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int Factorial = 1;
        System.out.print("Enter any positve integer : ");
        n = sc.nextInt();
        for (int i = n ;i <=n; i--) {
            Factorial *= i;
            if (i == 1) {
                break;
            }
        }
        System.out.println("Factorial :" + Factorial);
        sc.close();
    }
    
}

// import java.util.*;

// public class factorial{ 
//     public static void main (String[]args) {
//         Scanner sc = new Scanner(System.in);
//         int num; // To hold number
//         int fact =1; // To hold factorial 
//         System.out.print("Enter any positive integer:"); 
//         num=sc.nextInt();
//         for(int i =1;i<=num;i++) {
//             fact*=i;
//         }
//         System.out.println("Factorial: "+fact);
//     }
// }