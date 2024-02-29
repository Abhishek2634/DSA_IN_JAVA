package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(3,1,3,2);
    }
    static void hanoi(int n, int a , int c, int b){
        //   here n is no. of plates.
        // and a, b ,c are the towers and we need   to transfer the plates from tower a to tower c.
        // with the help of tower b.

        if(n == 0){
            return;
        }

        hanoi(n-1, a, b, c);
        System.out.println("moving "+n+ "th disk from "+a+"to"+c);
        hanoi(n-1, b, c, a);
    }
}
