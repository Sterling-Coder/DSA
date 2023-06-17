package Assignment;

public class Ques1 {

    // 1st question
    public static boolean Twice(int number[]) {
        for(int i = 0; i < number.length - 1; i++) {
            for (int j = i+1; j < number.length;j++) {
                if (number[i] == number[j]){
                return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,1};
        System.out.println(Twice(number));
    }
}