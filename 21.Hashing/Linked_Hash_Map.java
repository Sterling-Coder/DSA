import java.util.*;

public class Linked_Hash_Map {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>(); // sequence
        lhm.put("India", 150);
        lhm.put("China", 100);
        lhm.put("Pakistan", 50);

        HashMap<String,Integer>hm = new HashMap<>(); // value
        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("Pakistan", 50);

        System.out.println("LinkedHashMap : " + lhm);
        System.out.println("HashMap : " + hm);
        
    }
}