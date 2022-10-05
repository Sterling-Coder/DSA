public class Tiling {  
    /* AMAZON
       Qn. Given a "2 * n" board and tiles of size "2 * 1", count the number of
       ways to tile teh given board using the 2 * 1 tiles.
       (A tile can either be placed horizontally or virtically) */
    satic int TilingWay(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int horizonalWay = TilingWay(n-1);
        int VerticalWay = TilingWay(n-2);

        return horizonalWay + VerticalWay; // total way
    }
    public static void main(String[] args) {
        int n = 3;

        System.out.println(TilingWay(n));
    }
}
