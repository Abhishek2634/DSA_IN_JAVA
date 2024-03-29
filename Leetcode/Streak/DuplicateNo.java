
public class DuplicateNo {
    public static void main(String[] args) {
        //find duplicate no.
        int arr[] = {1,3,4,2,2};
        for(int i = 0; i < arr.length;i++){
            int idx = Math.abs(arr[i]);
            if(arr[idx] < 0){
                System.out.println(idx);
            }
            arr[idx] = - arr[idx];
        }
    }
    
}
