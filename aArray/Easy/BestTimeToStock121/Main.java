package aArray.Easy.BestTimeToStock121;

public class Main {
//    public static int maxProfit(int[] prices) {
//        int maxProfit =0;
//        for(int i=0; i<prices.length-1; i++){
//            int curProfit=0;
//            for(int j=i+1; j<prices.length;j++){
//                if(prices[j]-prices[i]> curProfit)
//                {
//                    curProfit= prices[j]-prices[i];
//                }
//            }
//            maxProfit= Math.max(curProfit, maxProfit);
//        }
//        return maxProfit;
//    }
public static int maxProfit(int[] prices) {
    if(prices.length<=1)
        return 0;
    int maxProfit =0;
    int cheapPrice=prices[0];
    for(int i=1; i<prices.length; i++){
        int curPrice=prices[i]- cheapPrice;
        maxProfit= Math.max(curPrice, maxProfit);
        cheapPrice= Math.min(cheapPrice, prices[i]);
    }
    return maxProfit;
}

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
