package binary;

public class powerOf2 {
    public static void main(String[] args) {
        int num = 1;
        if((num & num-1) == 0){
            System.out.println(" it is a power of 2");
        }else {
             System.out.println("it is not a power of 2");
        }
    }
}
