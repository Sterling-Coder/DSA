package Assignment;

import java.util.*;

public class anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        // convering to lowercase...

        str = str.toLowerCase();
        str1 = str1.toLowerCase();
        // sting to arr

        
        if(str.length() == str1.length()) {
            
            char strArray[] = str.toCharArray();
            char str1Array[] = str.toCharArray();
    
            //Sort array hehe
            Arrays.sort(strArray);
            Arrays.sort(str1Array);

            boolean result = Arrays.equals(strArray, str1Array); 
            if (result == true) {
                System.out.println(str + " and " + str1 + " Are anagrams");
            }
        } else {
            System.out.println(str + " and " + str1 + " Are not anagrams");
        }
        sc.close();
    }
}
