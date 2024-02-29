package Greedy;
import java.util.*;
class MinCoins{
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int price = 590;
        sol(coins,price);
    }
    static void sol(Integer coins[],int price){
        ArrayList <Integer>ls = new ArrayList<>();
        Arrays.sort(coins,Comparator.reverseOrder());
        int count = 0;
        for(int i = 0; i < coins.length;i++){
            if(coins[i] <= price){
                while(coins[i] <= price){
                    price -= coins[i];
                    count ++;
                    ls.add(coins[i]);
                }
            }
        }
        System.out.println("min no of coins is : " + count);
        for(int i = 0; i < ls.size();i++){
            System.out.print(ls.get(i) + " ");
        }
    }
}