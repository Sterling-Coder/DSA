
//Lesxicographic
public class largestString {
        public static void main(String[] args) { // O(n)
        String fruit[] = {"apple","banana","orange","mango","kivi","pineapple","Litchi"};

        String largest = fruit[0];

        for (int i =1; i<fruit.length; i++) {
            if(largest.compareToIgnoreCase(fruit[i]) < 0) {  /*compareTo --- perform latter wise comparision 
                                                             compare to ignore case -- treat 'A' & 'a' as SAME */
                largest = fruit[i];
            } 
        }
        System.out.println(largest);
    }
}