public class Permutation {
    public static void FindPermutation(String str, String ans) {
        if(str.length() == 0) { // this will be equal to zero bez. we r taking string 1 by 1 out & adding in new string..Afterword There will be no string remaining "0".
            System.out.println(ans);
        }
        for(int i =0; i<str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i+1); //  New String

            FindPermutation(Newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        FindPermutation(str,"");
    }
}