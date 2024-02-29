package Recursion;

public class sumOfNaturalNo {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    
    }
    static int sum(int n){
        if(n == 1) return 1;
        int s= sum(n-1);
        int res = n + s;
        return res;
    }
}
