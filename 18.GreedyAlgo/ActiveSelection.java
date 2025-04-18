import java.util.*;
public class ActiveSelection {
    public static void main(String args[]) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
   
int activities[][] = new int[start.length][3];   //if end array is not sort..
for(int i = 0; i<start.length; i++) {
    activities[i][0] = i;
    activities[i][1] = start[i];
    activities[i][2] = end[i];
}
// lambda function
   Array.sort(activities, Comparator.comparingDouble(o -> o[2]));
        
        //end time is sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        maxAct = 1;
        ans.add(activities[0][0]);  //ans.add(0);
        int lastEnd = end[0];
        for(int i =1; i<end.length; i++) {
            if(activities[i][i] >= lastEnd) {   //Start[i] instend of activities..
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("max activity =" + maxAct);
        for(int i = 0; i<ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
        }
    }
