import java.util.*;

public class ShortPath {
    public static float getShortPath(String path) {
        int x = 0 , y = 0;
        for (int i = 0; i <path.length(); i++) {
            int dir = path.charAt(i);

            if (dir == 'S'){ // south
                y--;
            } else if(dir == 'N') { // north
                y++;
            } else if(dir == 'W') {// west=2
                x++;
            }else if (dir == 'E') {// east
                x--;
            } else {
                System.out.println("Invalid char !");
            }
        }
        float X2 = x*x;
        float Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine(); //eg : WNENENENNN
        
        System.out.println(getShortPath(path));
        sc.close();
    }
}