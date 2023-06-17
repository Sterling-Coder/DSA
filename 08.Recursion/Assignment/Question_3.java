package Assignment;

public class Question_3 {
    static int Length(String str) {
        if(str.length() == 0) {
            return 0;
        }
        return Length(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        String str = "Hello Kya Hal Hai"; //17
        System.out.println(Length(str));
    }
}
