package binary;

public class setBit {
    public static void main(String[] args) {
        int num = 9;
        int bitplace = 1;
        int bitmask = 1 << bitplace;
        System.out.println(num | bitmask);

    }
}
