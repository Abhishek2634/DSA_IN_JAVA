package Arrays;
import java.util.*;
import java.util.Collections;

public class second_largest {
    public static void main(String[] args) {
        //to find second largest.
        // int first , second;
        // first = second = Integer.MIN_VALUE;
        // for(int i = 0;i < arr.length;i++){
            //     if(arr[i] > first){
                //         second = first;
                //         first = arr[i];
                //     }
                //     else if (arr[i] > second && arr[i] != first){
                    //         second = arr[i];
                    //     }
                    // }
                    // if(second == Integer.MIN_VALUE ){
                        //     System.out.println("invalid input");
                        //     return;
                        // }
                        // System.out.println(second);
                        
                        
                        //another method;
                        Integer arr[] = {5};
                        int second = Integer.MIN_VALUE;
                        Arrays.sort(arr,Collections.reverseOrder());
                        for(int i = 1;i < arr.length;i++){
                            if(arr[i] != arr[0]){
                                second = arr[i];
                                System.out.println(second);
                                return;
                            }
                        }
                        System.out.println("there is no second largest element");

        
    }

}
