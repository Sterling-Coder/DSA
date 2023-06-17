public class BasicOops {
    public static void main(String []args) {
        Pen P1 = new Pen(); // Constructor  P1-> Object
        P1.setColor("Blue");
        P1.setTip(8);
        System.out.println(P1.color);
        P1.color = "bLACK";
        System.out.println(P1.tip);

        BankAccount AccInfo = new BankAccount(); // AccInfo -> Object      { CONSTRUCTOR } 
        AccInfo.username = "AMAN";
        // AccInfo.Password = "ABCDEFG";    Can't access Password
        AccInfo.setpwd("ABCDEFG"); 
    }
}

class BankAccount {
    public String username;
    public String Password;  // Access Modifier -> private,default,protected,public...

    // we can change password using funtion but can't access Password.

    protected void setpwd(String pwd) { // funtion
        Password = pwd;
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newcolor) { // function
        color = newcolor;
    }
    void setTip(int newtip) {
        tip = newtip;
    }
}

class Student {
    String name;
    int age;
    float CGPA;

    void setCGPA(float CGPA) { //function
        
    }
}