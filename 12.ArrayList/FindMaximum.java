import java.util.ArrayList;

public class FindMaximum
{
  public static void main (String[]args)
  {
    ArrayList < Integer > list = new ArrayList <> ();

    list.add (2);
    list.add (5);
    list.add (9);
    list.add (3);
    list.add (6);
    list.add (10);
    
    int MAX = Integer.MIN_VALUE;

    for (int i = 0; i < list.size(); i++) {
        // if(MAX < list.get(i))
        // MAX = list.get(i);
        MAX = Math.max(MAX, list.get(i));
      }
    System.out.println("Max element : " +  MAX);
  }
}