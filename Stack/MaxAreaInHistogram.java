package Stack;

import java.util.Stack;

public class MaxAreaInHistogram {
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        int res = ans(arr);
        System.out.println(res);
    }
    static int  ans(int arr[]){
        int maxArea = 0;
        Stack <Integer> s = new Stack<>();
        int nextSmallRight[] = new int[arr.length];
        int nextSmallLeft[] = new int[arr.length];


        //next smallest right element in an array.
        for(int i = arr.length-1;i >= 0; i--){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallRight[i] = arr.length;
            }else{
                nextSmallRight[i] = s.peek();
            }
            s.push(i);
        }
        s.clear();
        
        System.out.println();
        //next smallest element  in the left of an array 
        for(int i = 0;i < arr.length; i++){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallLeft[i] = -1;
            }else{
                nextSmallLeft[i] = s.peek();
            }
            s.push(i);
        }
        
        for(int i = 0; i < arr.length;i++){
            int height = arr[i];
            int width = (nextSmallRight[i] - nextSmallLeft[i] - 1);
            int currArea = height * width;
            maxArea = Math.max(currArea , maxArea);
        }
        return maxArea;
    }
}
