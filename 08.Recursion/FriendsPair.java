public class FriendsPair {
    public static int FriendPairing(int n) {
        if(n == 1 | n == 2) {
            return n;
        }
        return FriendPairing(n-1) + (n-1)*FriendPairing(n-2);   // Single + Pair
    }
    public static void main(String[] args) {
        System.out.println(FriendPairing(4));
    }
}