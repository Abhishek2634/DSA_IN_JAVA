package Greedy;

public class BuyAndSellStocks {
    public static void main(String[] args) {
       int arr[]  = {7,6,4,3,1};
       int min = Integer.MAX_VALUE;
       int profit = 0;
       for(int i = 0; i < arr.length;i++){
        if(min > arr[i]){
            min = arr[i];
        }
        profit = Math.max(profit,arr[i] - min);
       }
       System.out.println(profit);
    }
}
