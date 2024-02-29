package BackTracking;

public class optimisedGridWays {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        int num = factorial((m-1) + (n-1));// if n == m = 3;  ;; it will be 4!
        int den = factorial(m-1);// divide it by 4 then ans 
        int finalden = den * den;
        System.out.println(num/finalden);
        
    }
    static int factorial(int x){
        int fact = 1;
        for(int i = 1; i <= x;i++){
            fact  *= i;
        }
        return fact;
    }
}
