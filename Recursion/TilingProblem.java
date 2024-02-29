package Recursion;

public class TilingProblem {
    public static void main(String[] args) { 
        System.out.println(Tiling(4));
    }
    static int Tiling(int n ){  // (2 X N floor size)
        //return total ways to make an floor of above size.

        if(n == 0 || n == 1) return 1; // base case;

        //vertical choice
        int fnm1 = Tiling(n-1);

        //horizontal choice
        int fnm2 = Tiling(n-2);
        return fnm1 + fnm2;

    }
}

