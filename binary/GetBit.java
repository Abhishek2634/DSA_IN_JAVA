package binary;
class GetBit{
    public static void main(String[] args) {
        int bitPos = 2;
        int num = 10 ;
        int bitmask = 1 << bitPos;
        
        if((num & bitmask) == 0){
            System.out.println("bit is 0");
        }else {
            System.out.println("bit is 1");
        }
    }
}