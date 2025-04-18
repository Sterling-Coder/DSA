import java.util.*;

public class Hash_Map {
    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm  = new HashMap<>();
        
        //insert
        hm.put("India", 220);
        hm.put("China", 190);
        System.out.println(hm); 

        //get
        int score = hm.get("India");
        System.out.println(score);
 
        int score2 = hm.get("China");
        System.out.println(score2);

        System.out.println(hm.get("Pakistan")); // null value...

        //ContainsKey - O(1)
        System.out.println(hm.containsKey("India")); //true
        System.out.println(hm.containsKey("Pakistan")); // false

        //remove - 0(1)
        System.out.println(hm.remove("India"));

        System.out.println(hm);

        //size & isEmpty
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
    }
}
