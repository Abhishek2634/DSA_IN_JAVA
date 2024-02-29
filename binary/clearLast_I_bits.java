package binary;

public class clearLast_I_bits {
    public static void main(String[] args) {
        // num = 1111 in binary : 15 in decimal; clear last 2 bits in it;  and the num become 12;

        int num = 15;
        int i = 2;
        int bitmask = -1 << i;
        System.out.println(bitmask & num);

        clearBits();
    }
    static void clearBits(){
        int num = 20;
        int start = 3;
        int end = 5;
        int a = -1 << end+1;
        int b = 1 << start - 1;
        int bitmask = a|b;

        System.out.println(bitmask & num);
    }
}
