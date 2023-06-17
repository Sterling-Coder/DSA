import java.util.*;

public class Palindrome {
    public static boolean PalindromeCheck(String str){
        for (int i = 0; i<str.length()/2; i++) {
           int n = str.length();
           if (str.charAt(i) != str.charAt(n-1-i)) {
            return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // racecar, noon, madam

        if(PalindromeCheck(str) == true) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
