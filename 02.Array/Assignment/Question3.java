package Assignment;

public class Question3 {
    public static int stock(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        int profit;
        for (int i = 0; i < price.length; i++){
            if (buyprice< price[i]) {
                profit = price[i] - buyprice;
                maxprofit = Math.max(maxprofit,profit);
            } else {
                buyprice = price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,6,4};

        System.out.println("Maximum Profit :" + stock(price));
    }
}