public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(); // call constructor
        Student s2 = new Student("Aman");
        System.out.println(s1); // garbage value
        System.out.println(s2.name);
    }
}

class Student {
    String name;
    int roll;

    // consructor overloading.... (making Student Class {constructor})

    Student() {  //constructor
        System.out.println("Constructor is called");
    }
    Student(String name) {
        this.name = name;   
    }
    Student (String name, int roll) {
    }
}