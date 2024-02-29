package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        // t.c = O(2^n);
        // s.c = O(n);
        if(n == 0 || n == 1) return n;
        int nm1 = fibo(n-1);
        int nm2 = fibo(n-2);
        return nm1 + nm2;



    }
}
