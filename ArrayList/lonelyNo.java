package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class lonelyNo {
    public static void main(String[] args) {
        ArrayList <Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(6);
        ls.add(5);
        ls.add(8);
        sol(ls);
        int []nums = {10,6,5,8};
        sort(nums);
    }
    static void sol(ArrayList<Integer>ls){
        int max = 0;
        ArrayList<Integer> g = new ArrayList<>();
        for(int i = 0; i < ls.size();i++){
            max = Math.max(max,ls.get(i));
        }
        int arr[] = new int [max+3];
        for(int i : ls){
            arr[i+1]++;
        }
        for(int i = 0; i < ls.size();i++){
            if(arr[ls.get(i)] == 0 && arr[ls.get(i) +1] == 1 && arr[ls.get(i)+2] == 0){
                g.add(ls.get(i));
            }
        }
        System.out.println(g);
    }
    static void sort(int nums[]){
        Arrays.sort(nums);
        ArrayList <Integer>ls = new ArrayList<>();
        if(nums.length == 1){
            ls.add(nums[0]);
        }
        if(nums.length >= 2 && nums[0] + 1 < nums[1]){
            ls.add(nums[0]);
        }

        for(int i = 1; i < nums.length-1;i++){
            if(nums[i-1] + 1 < nums[i] && nums[i] + 1 < nums[i+1]){
                ls.add(nums[i]);
            }
        }

        if(nums.length >= 2 && nums[nums.length-1] > nums[nums.length-2]+1){
            ls.add(nums[nums.length-1]);
        }
        System.out.println(ls);
    }
}
