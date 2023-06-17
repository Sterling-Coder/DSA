public class staticKey {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.School = "DPS";

        Student s2 = new Student();
        System.out.println(s2.School); // output DPS
    }
}

class Student {
    String name;
    int roll;
    String School; // static is use bez.. school is common for all students

    void getName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
