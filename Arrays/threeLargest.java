package Arrays;
public class threeLargest {
    public static void main(String[] args) {
        int arr[] = {22,11,4,3,5,22,23,23,11};
        int n = arr.length;
       int first,second,third;
       first = second = third = Integer.MIN_VALUE;

       for(int i = 0; i < n;i++){
        if(arr[i] > first){
            third = second;
            second = first;
            first = arr[i];
        }
        else if (arr[i] > second && arr[i] != first){
            third = second;
            second = arr[i];
        }
        else if (arr[i] > third && arr[i] != second && arr[i] != first){
            third = arr[i];
        }
       }
       System.out.println(first);
       System.out.println(second);
       System.out.println(third);


  
    }
}
