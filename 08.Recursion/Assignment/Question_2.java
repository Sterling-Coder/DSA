package Assignment;

public class Question_2 {
    static String digit[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    
    public static void printDigit(int number) {

        if (number == 0) {
            return;
        }

        int lastDigit = number%10;
        printDigit(number/10);
        System.out.print(digit[lastDigit] + " ");
    }
    public static void main(String[] args) {
        printDigit(1234);
        System.out.println();
    }
}
