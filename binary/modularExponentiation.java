package binary;

public class modularExponentiation {
    public static void main(String[] args) {
        int modulus = 7;
        int base = 3;
        int exponent = 5;
        code(base , exponent,modulus);
    }
    static void code(int base,int exponent, int modulus){
        if(modulus == 1) System.out.println(0);
        int result = 1;
        base = base % modulus;
        while (exponent > 0) {
            if(exponent % 2 == 1){
                result = (result * base) % modulus;
            }
            exponent >>= 1;
            base = (base * base) % modulus;
        }
        System.out.println(result);
    }
}
