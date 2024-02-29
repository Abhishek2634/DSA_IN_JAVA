package Arrays;

public class trappingRainwater {
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        trap(arr);;
    }
    static void trap(int arr[]){
        //leftmax array;
        int n = arr.length;
        int leftmax [] = new int [n];
        leftmax[0] = arr[0];
        for(int i = 1;i < n;i++){
            if(arr[i] > leftmax[i-1]){
                leftmax[i] = arr[i];
            }
            else{
                leftmax[i] = leftmax[i-1];
            }
        }
        //rightmax array;
        int rightmax [] = new int [n];
        rightmax[n-1] = arr[n-1];
        for(int i = n-2;i >= 0;i--){
            if(arr[i] > rightmax[i+1]){
                rightmax[i] = arr[i];
            }
            else{
                rightmax[i] = rightmax[i+1];
            }
        }

        int waterlevel [] = new int [n];
        for(int i = 0; i < n;i++){
            waterlevel[i] = Math.min(rightmax[i],leftmax[i]);
        }

        int trapwater = 0;
        for(int i = 0;i < n;i++){
            trapwater += waterlevel[i] - arr[i];
        }
        System.out.println(trapwater);
    }
    
}
