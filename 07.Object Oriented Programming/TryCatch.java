public class TryCatch {
    public static void main(String[] args) {
        String str = "123";
        
        try {
            int a = Integer.parseInt(str);
            System.out.println(a);
        }
        catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println("Main methord complete");
    }
}