public class Switch {
    public static void main(String[] args) {
        int number = 4;

        switch (number) {
            case 3:
                System.out.println("Hello");
                break;
            case 1:
                System.out.println("Processing");
                break;
            case 5:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Cheating");
        }
    }
}
