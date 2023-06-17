package Assignment;

public class Question4 {
    public static int Trapped(int height[]) {
        int leftmax[] = new int[height.length];
        // Calculating Left Max

        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }

        int rightmax[] = new int[height.length];
        // Calculation Right Max

        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >=0;i--) { // Reverse Loop
            rightmax[i] =Math.max(rightmax[i+1], height[i]);
        }
        // calculating Trapped water using loop...

        int trappedWater = 0;
        for (int i = 0; i<height.length;i++) {
            
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 3, 2, 5};

        System.out.println("TrapWater  :" + Trapped(height));
    }
}
