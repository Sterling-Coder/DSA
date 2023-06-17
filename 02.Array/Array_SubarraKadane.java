public class Array_SubarraKadane {
    public static void Kadanes(int number[]) {
        int max = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i =0; i < number.length;i++) {
            currsum = currsum + number[i];
            if (currsum < 0) {
                currsum = 0;
            }
            max = Math.max(currsum, max);
        }
        System.out.println("Maximum sum :" + max);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        Kadanes(number);
    }
}