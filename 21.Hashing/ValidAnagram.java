
/**Given two string s and t, return true if it is an anagram of s, and flase otherwise. 
An anagram is a word or phase formed by rearrangingthe letter of a different word 
or phase, typically using all the orignal letters excatly once. **/

// ApnaCollage 
import java.util.*;

public class ValidAnagram {
    public static boolean CheckAnagram(String t, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) != null) {
                if(map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String t = "amma";
        String s = "maam";

        System.out.println(CheckAnagram(t, s));
    }
}

// code my ME  BUT now working completly
// import java.util.*;

// public class ValidAnagram {
//     public static boolean CheckAnagram(String t, String s) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         for (int i = 0; i < t.length(); i++) {
//             map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
//         }
//         for (int i = 0; i < s.length(); i++) {
//             if (map.get(s.charAt(i)) != null) {
//                 map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
//             } else {
//                 return false;
//             }
//         }
//         for (Character key : map.keySet()) { // direct call
//             if (map.get(key) > 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String t = "amma";
//         String s = "maam";

//         System.out.println(CheckAnagram(t, s));
//     }
// }

