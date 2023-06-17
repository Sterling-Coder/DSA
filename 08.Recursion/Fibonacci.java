public class Fibonacci {
    static int FibonacciNum(int n) {
        int fibonacci;
        if (n == 0 || n == 1) {
            return n;
        }
        fibonacci = FibonacciNum(n-1) + FibonacciNum(n - 2);
        return fibonacci;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(FibonacciNum(n)); // SC-> O(n)  TC->  O(2^n)
        
    }
}