public class Factorial {
    static int FactorialNum(int n) {
        int factorial;
        if (n == 0) { // base function
            System.out.println();
            return 1;
        }
        factorial = n * FactorialNum(n - 1); // call funtion
        return factorial;
    }

    public static void main(String[] args) {
        int n = 5;

        FactorialNum(n);
    }
}
