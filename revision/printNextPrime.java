package revision;

import java.util.Scanner;

public class printNextPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a prime no.");
        int primeNo = sc.nextInt();
        sc.close();
        check(primeNo);
    }
    static void check(int curr){
        curr++;
        while(!prime(curr)){
            curr++;
        }
        System.out.println(curr);
    }
    static boolean prime(int num){
        boolean bool = true;
        for(int i = 2;i <= Math.sqrt(num);i++){
            if(num % i == 0){
                bool = false;
            }
        }
        return bool;
    }
}
