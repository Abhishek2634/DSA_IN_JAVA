package Recursion;

public class powerOfX {
    public static void main(String[] args) {
        int x = 3;
        int n = 3;
        System.out.println(optimised(x,n));
        // System.out.println(power(x, n));
    }
    static int power(int x , int n){
        //time complexity == > O(N)
        if( n == 0) return 1;
        return x * power(x, n-1);

    }
    
    static int optimised (int x , int n){
        if(n == 0) return 1;
        int halfPower = optimised(x, n/2);
        int halfPowSq = halfPower * halfPower;

        
        //time complexity = O(logN)
        if(n % 2 != 0){
            halfPowSq = x * halfPowSq;
        }

        return halfPowSq;

        
    }
}
