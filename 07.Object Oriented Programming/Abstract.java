public class Abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }

}

abstract class Animal {
    void eat() { // normal
        System.out.println("Animal eats");
    }

    abstract void walk();
}

    class Horse extends Animal {

        void walk() {
            System.out.println("walf on 4 legs");
        }
    }

    class Chicken extends Animal {
        void walk() {
            System.out.println("Walks on 2 legs");
        }
    }