package Recursion;

public class printNos {
    public static void main(String[] args) {
        int n = 10;
        decreasing(n);
        increasing(n);
    }
    static void decreasing(int n ){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        decreasing(n-1);

    }

    static void increasing(int n ){
        if(n == 1)
        {
            System.out.print(n+" ");
            return ;
        }
        increasing(n-1);
        System.out.print(n+" ");
    }
}
