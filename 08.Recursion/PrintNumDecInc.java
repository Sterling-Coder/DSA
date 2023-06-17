public class PrintNumDecInc {

    static void printDec(int n) {
        if(n == 1) { // base case
            System.out.print(n);
            System.out.println();
            return;
        }
        System.out.print(n + " ");
        printDec(n-1); // call function
    }

    static void printInc(int n) {
        if(n == 1) { // base case
            System.out.print(n + " ");
            return;
        }
        printInc(n-1); // call function
        System.out.print(n + " ");
    }

    static int sumNum(int n) {
        int sum;
        if (n == 1) { // base case
            return 1;
        }
        sum = n + sumNum(n-1); // call function
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;

        printDec(n); // O(n)
        printInc(n); // O(n)
        System.out.println(sumNum(n)); // O(n)
    }
}