import java.util.*;

public interface Iterate {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India", 200);
        hm.put("China", 150);
        hm.put("Pakistan", 100);
        hm.put("US", 50);

        System.out.println(hm);

        //iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) { //foreach loop
            System.out.println("key = " + k + ", value = " + hm.get(k));
        }

    }
}
