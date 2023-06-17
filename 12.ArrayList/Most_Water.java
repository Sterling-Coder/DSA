import java.util.ArrayList;

public class Most_Water
{
    public static int Water_STORED(ArrayList<Integer> list) {   //Brute Force
        int water = 0;
        for (int i = 0; i < list.size () - 1; i++) {
	    int width = 0;
	    for (int j = i + 1; j < list.size (); j++) {
	    int height = Math.min(list.get (i), list.get (j));
	    width++;
      	int water_Contain = width * height;
      	water = Math.max(water, water_Contain);
	  }
    }
    return water;
}

  public static void main (String args[])
  {
    ArrayList < Integer > list = new ArrayList <> ();
    list.add (1);
    list.add (8);
    list.add (6);
    list.add (2);
    list.add (5);
    list.add (4);
    list.add (8);
    list.add (3);
    list.add (7);
    
    System.out.println(Water_STORED(list));
  }
}