public class Array_Largest {
public static int Measure(int Array[]) {
    int Largest = Integer.MIN_VALUE; // -infinity
    int Smallest = Integer.MAX_VALUE; // +infinity

    for(int i = 0; i<Array.length; i++ ) {
        if (Array[i] > Largest) {
            Largest = Array[i];
        }
        if (Array[i] < Smallest) {
            Smallest = Array[i];
        }
    }
    System.out.println("Smallest Array :" + Smallest);
    return Largest;
}

    public static void main(String[] args) {
        int Array[] = { 1, 3, 7, 10, 12, 4 };
        System.out.println("Largest Array :" + Measure(Array));
    }
}
