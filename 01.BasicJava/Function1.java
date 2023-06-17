public class Function1 {

    public static int product(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {
        int factorial = 1;
        for(int i = 1; i <= n; i++) {
             factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
       int pro = product(4,5);
       System.out.println(pro);

       System.out.println(factorial(5));
    }
}
