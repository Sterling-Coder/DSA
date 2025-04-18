import java.util.*;

class MajorityElements {

    public static void MajorEle(int num[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(num[i])) {
                map.put(num[i], map.get(num[i]) + 1);
            } else {
                map.put(num[i], 1);
            }
            map.put(num[i], map.getOrDefault(num[i], null));
        }
        Set<Integer> KeySet = map.keySet();
        for (Integer key : KeySet) {
            if (map.get(num[key]) > num.length / 3) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        int num[] = { 1, 3, 2, 5, 1, 5, 1, 2, 2 };
        MajorEle(num);
    }
}