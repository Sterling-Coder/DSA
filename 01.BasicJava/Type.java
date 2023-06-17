public class Type {
    public static void main(String[] args) {
// Type Conversion (Widening)

        // Cant Convert float to int (BEZ.. data can be loss)

/*      float a = 25.889f;
        int b = a;
        System.out.println(b);  */

// Type Casting

        // Data loss (0.889)

        float c = 25.889f;
        int d = (int) c;
        System.out.println(d);

//Type Promotion   (Done in Expressions  Ex. add,sub,prod..)
        byte a = 5;
        // a coneverted to int

/*      byte b = a * 2;  -->Can't convert int to byte<--
        JAVA - Default-- Convert small data byte to int and large data byte to double  */
        byte b = (byte) (a * 2);
        System.out.println(b);

        char e = 'a';
        char f = 'b';

        System.out.println((int)(e));  // see the int value of a
        System.out.println((int)(f));  // see the int value of b
        System.out.println(e-f);
    }
}
