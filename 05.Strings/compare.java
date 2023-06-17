public class compare {
    public static void main(String[] args) {
        String sc1 = "Tony";
        // indecate the sc1 string address..bez of same data
        String sc2 = "Tony";
        // make new string ...new location
        String sc3 = new String("Tony");

        if (sc1 == sc2) {
            System.out.println("Strings are equal !");
        } else {
            System.out.println("String are not equal !");
        }
        if (sc1 == sc3) {
            System.out.println("Strings are equal !");
        } else {
            System.out.println("String are not equal !");
        }
        // t-o campare data into strings

        if (sc1.equals(sc3)) {
            System.out.println("Strings are equal !");
        } else {
            System.out.println("String are not equal !");
        }
    }
}
