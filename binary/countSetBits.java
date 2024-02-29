package binary;

public class countSetBits {
    public static void main(String[] args) {
        int num = 16;
        int count = 0; 
        while(num > 0){
            if((num  &  1) != 0){
                count ++;
            }
            num >>= 1;
        }
        System.out.println(count);

        another();
    }
    static void another(){
        int num = 7;
        int co = 0;
        while(num != 0){
            num &= (num-1);
            co++;
        }
        System.out.println(co);
    }
}
