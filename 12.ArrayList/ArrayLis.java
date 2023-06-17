import java.util.ArrayList;

public class ArrayLis {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        Integer element = list.get(2);
        System.out.println(element);
    }
}