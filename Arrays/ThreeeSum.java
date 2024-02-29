package Arrays;
import java.util.*;

public class ThreeeSum {
    public static void main(String[] args) {
        int arr [] = {-1, 0, 1, 2, -1, -4};     
        ArrayList<ArrayList<Integer>> res = brute(arr);
        for(ArrayList<Integer> name : res){
            System.out.println(name);
        }

    }
    static ArrayList<ArrayList<Integer>> brute(int arr[]){
        int n = arr.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n-2;i++){
            for(int j = i+1;j < n-1; j++){
                for(int k = j+1; k < n;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        int triplet[] = {arr[i],arr[j],arr[k]};
                        Arrays.sort(triplet);
                        ArrayList<Integer> add = new ArrayList<>();
                        for ( int num : triplet){
                            add.add(num);
                        }
                        if(!result.contains(add)){
                            result.add(add);
                        }
                        
                    }
                }
            }
        }
        return result;
    }
}
