package aArray.Medium.BestTimeToStock122;

public class Main {

//    public static int maxProfit(int[] prices) {
//        int n = prices.length;
//        Map<Integer, int[]> hm = new HashMap<>();
//        for(int i=0; i< n-1; i++ ){
//            if(prices[i+1]> prices[i])
//                hm.put(i, new int[]{prices[i], prices[i+1]});
//            else
//                hm.put(i, new int[]{0, 0});
//        }
//        int total=0;
//        for(Map.Entry<Integer, int[]> el: hm.entrySet()){
//            int[] val=el.getValue();
//            total+= (val[1]-val[0]);
//        }
//        return total;
//    }

    // ** my optimised solution
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int res=0;
        for(int i=0; i< n-1; i++ ){
            if(prices[i+1]> prices[i])
                res+= (prices[i+1]- prices[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums= new int[]{2,1,2,1,0,0,1};
        System.out.println(maxProfit(nums));
    }
}
