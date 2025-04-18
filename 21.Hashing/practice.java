import java.util.*;

public class practice{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India",200);
        hm.put("Pakistam",150);
        hm.put("China",100);

        System.out.println(hm);

        //iternate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        //for each loop
        for (String k : keys) {
            System.out.println("keys - "+  k + ",Value - " + hm.get(k));
        }
    }
}