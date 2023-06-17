public class Tiling {   // AMAZON
    static int TilingWay(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return TilingWay(n-1) + TilingWay(n-2); // total way = HorizontalWay + VerticalWays
    }
    public static void main(String[] args) {
        
        System.out.println(TilingWay(5));
    }
}