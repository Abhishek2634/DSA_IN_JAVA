package revision;

public class stock {
    public static void main(String[] args) {
        int Prices[] = {7, 1, 4,  7, 1} ;
        stocks(Prices);

    }
    static void stocks(int prices[]){
        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;
        for(int i = 0;i < prices.length;i++){
            if(buyingPrice < prices[i]){
                int profit = prices[i] - buyingPrice;
                maxProfit = Math.max(profit,maxProfit);
            }else{
                buyingPrice = prices[i];
            }
        }
        System.out.println( maxProfit);
    }
}
