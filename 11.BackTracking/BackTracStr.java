public class BackTracStr {
    public static void SubSet(String str, String ans, int i ) {
        if (i == str.length() ) {    // To show empty set to null
          //  if (ans.length() == 0) {
          //      System.out.println("null");
          //  }else {
                System.out.println(ans);
          //  }
            return;
        }

        SubSet(str,ans+str.charAt(i),i+1); // Yes
        SubSet(str, ans, i+1); // No
    }
    public static void main(String[] args) {
        String str = "abc";
        SubSet(str, "",0);
    }
}