public class BasicOops2 {
    public static void main(String []args) {
        Pen P1 = new Pen(); // Constructor  P1-> Object
        P1.setColor("Blue");
        P1.setTip(8);
        System.out.println(P1.getColor());
        P1.setColor("bLack");
        System.out.println(P1.getTip());

    }
}

class Pen{
    private String color;
    private int tip;
 
    String getColor() { // function
         return this.color;
    }
    int getTip() {
         return this.tip;
    }
    void setColor(String color) {
         this.color = color;
    }
    void setTip(int tip) {
        this.tip = tip;
    }
}