package Arrays;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int arr[] = new int[50];
        Scanner sc = new Scanner(System.in);
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        sc.close(); 
        arr[1] = 40;
        System.out.println("phy : "+arr[0]+"\nchem : "+arr[1]+"\nmaths : "+arr[2]);
        System.out.println(arr[40]);
        
    }
}
