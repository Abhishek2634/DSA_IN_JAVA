package Arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        optimised(arr);
    }
    static void stock(int [] arr){
        int buyPrice = Integer.MAX_VALUE;
        int sellPrice = Integer.MIN_VALUE;
        int profit = 0;
        for(int i = 0;i < arr.length-1;i++){
            buyPrice =  arr[i];
            for(int j = i+1;j < arr.length;j++){
                sellPrice = arr[j];
                profit = Math.max(sellPrice - buyPrice,profit);
            }
            if(profit < 0){
                profit = 0;
            }
        }
        System.out.println("profit  is :"+ profit);
    }

    static void optimised (int arr[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i < arr.length;i++){
            if(buyPrice < arr[i]){
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(profit,maxProfit);
            }else{
                buyPrice = arr[i];
            }
        }
        System.out.println("maxProfit is "+maxProfit);
    }
}
