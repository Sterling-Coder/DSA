import java.util.*;

public class QuestionPrac {
    public static void main(String[] args) {

        // 1st Questiion
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int a = sc.nextInt();

        String Type = (a > 0)? "Positve": "Negative";
        System.out.println(Type);

        // 2ns Quesrtion 
        double Temp = 103.5;

        String Fever = (Temp > 100)? "You have a fever": "You don't have a fever";
        System.out.println(Fever);

        // 3rd Quesstion 
        int num = sc.nextInt();
        
        switch(num) {
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thrusday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            case 7 : System.out.println("Sunday ");
            break;
            default : System.out.println(" Kya chate ho be !");

            // 5th Qiuestion

            System.out.println("Enter Year To Know It's Leap Year Or Not !");
            int Year = sc.nextInt();

            String Ans = (Year%4 == 0 || Year%100 == 0 || Year%400 == 0)? "Leap Year": "Not a Leap Year";
            System.out.println(Ans);
        }
        sc.close();
    }
}
