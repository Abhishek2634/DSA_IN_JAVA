package Recursion;

public class Assignment {
    public static void main(String[] args) {
    //    int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
    //    int key = 2;
    //    int i = 0;
    //    indices(arr,key,i);      // output -> 1 5 7 8


    // String arr [] = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    // StringBuilder sb = new StringBuilder();
    // int r = 0;
    // String(2000,arr,sb,r);
    // System.out.println(sb.toString());


    String a = "abhishek";
    System.out.println(lengthOfString(a));
    // int b = 0;
    // length(a,b);
    }
    static int lengthOfString(String a){
        if(a.length() == 0) return 0;
        return lengthOfString(a.substring(1)) + 1;
    }



    static void length(String a ,int b){
        if(b == a.length()){
         System.out.println(b);
        return;
        }   
        length(a, b+1);
    }

    static void String(int n,String arr[],StringBuilder sb,int r){
        if (n == 0) {
            return;
        }
        r = n % 10;
        n /= 10;
        String(n, arr, sb, r);
        sb.append(arr[r]).append(" ");
        
    }

    static void indices (int arr[],int key,int i){
        if(i == arr.length) return;
        if(arr[i] == key){
            System.out.print(i+" ");
            indices(arr, key, i+1);
        }
        else indices(arr, key, i+1);
    }
}
