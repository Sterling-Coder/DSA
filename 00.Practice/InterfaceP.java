public class InterfaceP {
    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.eat();

        Both b1 = new Both();
        b1.eat();
    }
}

interface Herbivoes {
    void eat();
}

interface Carnivores {
    void eat();
}

class Lion implements Carnivores {
    public void eat() {
        System.out.println("Done");
    }
}

class Cow implements Herbivoes {
    public void eat() {
        System.out.println("End");
    }
}

class Both implements Herbivoes, Carnivores {
    public void eat() {
        System.out.println("Both");
    }
}
