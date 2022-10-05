public class power {
    static int Power(int x, int n) { //O(n)
        int power;
        if (n == 0) {
            return 1;
        }
        power = x * Power(x, n-1);
        return power;
        }
        
    static int PowerOp(int x, int n) { //O(logn)
        if (n == 0) {
            return 1;
        }
        int halfPower = PowerOp(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        //n is odd
        if (n % 2 != 0) {
           halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }
        public static void main(String[] args) {

            System.out.println(Power(2, 4));
            System.out.println(PowerOp(2,4));
        }
}
