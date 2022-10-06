 /*.              GOLDMAN SACHS
  Qn. Given n friends, each one can remain single or can be paired up with some other
  friend. Each friend can be paired only once. Freind out the total number of ways in
  which frined can remain single or can be paired up  */

public class FriendsPair {
  
    public static int FriendPairing(int n) {
        if(n == 1 | n == 2) {
            return n;
        }
        return FriendPairing(n-1) + (n-1)*FriendPairing(n-2); // Single + Pair
    }
    public static void main(String[] args) {
        System.out.println(FriendPairing(4));
    }
}
