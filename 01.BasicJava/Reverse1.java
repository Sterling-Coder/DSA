public class Reverse1 {
    public static void main(String[] args) {
        int  n = 2300;
        int LastDigit;
        int rev = 0;
        
        while ( n > 0 ) {
            LastDigit = n % 10;
            rev = (rev * 10) + LastDigit;
            n /= 10;
        }
        System.out.println(rev);
    }
}