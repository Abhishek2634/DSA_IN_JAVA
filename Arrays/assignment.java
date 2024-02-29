package Arrays;

public class assignment {
    public static void main(String[] args) {
        int arr [] = {9,2,9,1};
        boolean val = bool(arr);
            System.out.println(val);
    }
    // static boolean bool(int [] arr){
    //     for(int i = 0; i < arr.length-1;i++){
    //         for(int j = i+1;j < arr.length;j++){
    //             if(i == j){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    static boolean bool(int arr[]){
        int i = 0;
        int j = i+1;
        while(j < arr.length){
            if(arr[i] == arr[j]){
                return true;
            }else{
                j++;
            }
        }
        return false;
    }
    
}
