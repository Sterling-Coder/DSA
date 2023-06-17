package Assignment;
public class Question2 {
    public static int majorityElement(int[] arr) {
        int majorityElement = arr.length / 2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;
                }
            }
            if (count >= majorityElement) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main() {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
    }
}