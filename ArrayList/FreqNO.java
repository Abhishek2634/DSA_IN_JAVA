package ArrayList;

import java.util.ArrayList;

public class FreqNO {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1000);
        arr.add(200);
        arr.add(1);
        arr.add(1000);
        ans(arr,1);
    }
    static void ans(ArrayList<Integer> ar,int key){
        int arr[] = new int[1001];
        for(int i = 0; i < ar.size()-1;i++){
            if(ar.get(i) == key){
                arr[ar.get(i+1)]++;
            }
        }
        int max = 0;
        int res = 0;
        for(int i = 0; i <= 1000;i++){
            if(arr[i] > max){
                max = arr[i];
                res = i;
            }
        }
        System.out.println(res);
    }
}
