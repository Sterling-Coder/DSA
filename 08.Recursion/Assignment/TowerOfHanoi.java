package Assignment;

public class TowerOfHanoi {
    public static void Tower(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("transfer disk "+n+ " " + "from "+source+" to "+destination);
            return;
        }
        Tower(n-1, source, destination, helper);
        System.out.println("transfer disk "+n+ " " + "from "+source+" to "+helper);
        Tower(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n = 3;
        Tower(n, "A",   "B" , "C");
    }
}