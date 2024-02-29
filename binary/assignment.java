package binary;

public class assignment {
    public static void main(String[] args) {
        upperToLower();
    }
    static void upperToLower(){
        for(int i = 'A';i <= 'Z';i++){
            System.out.print((char)(i+32)+" ");
        }
        System.out.println();
        for(int i = 'A';i <= 'Z';i++){
            System.out.print((char)(i|' ')+" ");
        }
        
    }
}
