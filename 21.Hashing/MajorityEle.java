// Given an integer array of size n, Find all element that apper more than [n/3] times.
import java.util.*;

public class MajorityEle {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int num[] = {1,3,2,5,1,3,1,5,1};


        for(int i = 0; i < num.length; i++) {
            // if(map.containsKey(num[i])) {
            //     map.put(num[i], + map.get(num[i]) + 1);
            // } else {
            //     map.put(num[i], 1);
            // }

            map.put(num[i], map.getOrDefault(num[i], 0) + 1);
        }
       // Set<Integer> keySet = map.keySet();
        for(Integer key : map.keySet()) { // direct call 
            if(map.get(key) > num.length/3) {
                System.out.println(key);
            }
        }
    }
}