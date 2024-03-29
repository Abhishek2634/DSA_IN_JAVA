
import java.util.ArrayList;

public class Find_All_Duplicates {
    public static void main(String[] args) {
        int arr[] = {10,2,5,10,9,1,1,4,3,7};
        // hashmap , freq array uses n time 
        // this algo uses 1 time
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length;i++){
            int idx = Math.abs(arr[i]) - 1;
            if(arr[idx] < 0){
                list.add(idx+1);
            }
            arr[idx] = -arr[idx];
        }
        System.out.println(list);
    }
}
