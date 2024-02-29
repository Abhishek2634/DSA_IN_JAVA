package binary;

public class clearBit {
    public static void main(String[] args) {
        int num = 5;
        int bitplace = 2;
        int bitmask = ~(1 << bitplace);
        System.out.println(bitmask & num);

    }
}
