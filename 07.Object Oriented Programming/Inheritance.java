                                                    // Multi classs

public class Inheritance {       
    public static void main(String[] args) {
        WAVE pani = new WAVE();
        pani.eat();
    }
}
// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eat");
    }
    void breath() {
        System.out.println("breath");
    }
}

//derived Class

class fish extends Animal {
     int fings;

     void water() {
        System.out.println("Water");
     }
}

class WAVE extends fish {
    int Dance;

    void dance() {
        System.out.println("");
    }
}