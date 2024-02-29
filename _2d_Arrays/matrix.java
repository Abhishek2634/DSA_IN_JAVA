package _2d_Arrays;
import java.util.Scanner;


public class matrix {
    static void check(int arr[][], int key){
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){
                if(arr[i][j] == key){
                    System.out.println("key is found at index : ("+i+","+j+")");
                    return;
                }
            }
        }
        System.out.println("key is not found");
    }

    static void print (int arr[][]){
        Scanner sc = new Scanner (System.in);
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int key = 8;
        print (arr);
        check(arr,key);
    }
}
