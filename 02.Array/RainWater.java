public class RainWater {

    public static int Trapped(int height[]){
        //calculate left max Bound - Array
        int Leftmax[] = new int[height.length];
        
        Leftmax[0] = height[0];
        for (int i = 1; i<height.length;i++) {
            Leftmax[i] = Math.max(height[i],Leftmax[i-1]);
        }
        //calculate Right max Bound - Array
        int Rightmax[] = new int[height.length];
        
        Rightmax[height.length-1] = height[height.length-1];
        for (int i = height.length - 2 ; i >= 0; i--) {
            Rightmax[i] = Math.max(height[i],Rightmax[i+1]);
        }
        //loop
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            //waterlevel = min (leftmaxbound,rightmaxbound)
            int waterlevel = Math.min(Leftmax[i],Rightmax[i]);
            //trapped Water = water level - height
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        System.out.println("Trapped Water :" + Trapped(height));
    }
}