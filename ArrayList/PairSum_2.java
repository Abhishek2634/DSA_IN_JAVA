package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class PairSum_2 {
    public static void main(String[] args) {
        ArrayList <Integer>ls = new ArrayList<>();
        ls.add(11);
        ls.add(15);
        ls.add(6);
        ls.add(8);
        ls.add(9);
        ls.add(10);
        int target = 16;

        check(ls,target);
    }
   static void check(ArrayList<Integer>ls,int target){
        int n = ls.size();
        int bp = -1;
        for(int i = 0; i < ls.size();i++){
            if(ls.get(i) > ls.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;

        int arr[] = new int[2];
        while(lp != rp){
            if(ls.get(lp) + ls.get(rp) == target){
                arr[0] = lp;
                arr[1] = rp;
                break;
            }else if (ls.get(lp) + ls.get(rp) > target){
                rp = (rp-1+n)%n;
            }else{
                lp = (lp+1)%n;
            }
        }
        System.out.println(Arrays.toString(arr));

        
    }
}
