package Assignment;

import java.util.*;

public class lowecase {
    public static void Lowecase(String str) {
        int count = 0;
        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("No. oof vowel in your Sentence is : " + count);
    }
    public static void main(String[] args) {
        System.out.println("Enter Word : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Lowecase(str);
        sc.close();
    }
}