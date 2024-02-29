package Greedy;
import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        //Given the weights and val of N items,put these items in a knapsack of capacity of w to get the max total value in the knapsack.
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int w = 50;

        double ans[][] = new double[val.length][2];
        for(int i = 0;i < ans.length;i++){
            ans[i][0] = i;
            double ratio = (double) val[i]/weight[i];
            ans[i][1] = ratio;
        }
        Arrays.sort(ans,Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalVal = 0;
        for(int i = ans.length-1;i >= 0;i--){
            //include full part.
            int idx = (int) ans[i][0];
            if(capacity >= weight[idx]){
                finalVal += val[idx];
                capacity -= weight[idx];
            }else{
                //include fractional part.
               finalVal += ans[i][1] * capacity;
               capacity = 0;
               break;
            }
        }
        System.out.println( finalVal);
    }
}
