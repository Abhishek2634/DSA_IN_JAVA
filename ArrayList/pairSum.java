package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class pairSum {
    public static void main(String[] args) {
        ArrayList <Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 4;
        
        brute(list,target);
        twoPointers(list,target);//for sorted list;

    }
    static void brute(ArrayList<Integer> list,int target){
        int arr[] = new int[2];
        for(int i = 0; i < list.size()-1;i++){
            int curr = target - list.get(i);
            for(int j = i+1; j < list.size();j++){
                if(curr == list.get(j)){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void twoPointers(ArrayList<Integer> list , int target){
        int arr[] = new int [2];
        int rt = list.size()-1;
        int lt = 0;

        while(rt > lt){
            if(list.get(rt) + list.get(lt) == target){
                arr[0] = lt;
                arr[1] = rt;
                lt++;

            }
            else if (list.get(rt) + list.get(lt) > target){
                rt--;
            }else{
                lt++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
