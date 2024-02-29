package binary;


public class oddOrEven {
    public static void main(String[] args) {
        int num = 2;
        if((num & 1) == 1){
            System.out.println(" its is odd");
        }else{
            System.out.println("its is even");
        }
    }
}
