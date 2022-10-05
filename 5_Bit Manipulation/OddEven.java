public class OddEven {
    public static void main(String args[]) {
        int n = 10;
        int bitMask = 1;
        if((n & bitMask) == 0) { // & bitwise (AND operator)
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
