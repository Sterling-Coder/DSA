public class Array_Subarray {
//Time Complexity 😫
    public static void Subarray(int number[]) {
        int ts = 0;
        int currsum;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                currsum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                    currsum += number[k];
                }
                ts++;
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
                System.out.println("(Sum of Array :" + currsum + ")");
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum Sum : " + maxsum);
        System.out.println("Total Subarray :" + ts);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        Subarray(number);
    }
}
