import  java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0){
            int LastDigit = n % 10;
            n = n / 10;
            System.out.print(LastDigit);
            sc.close();
        }
    }
}