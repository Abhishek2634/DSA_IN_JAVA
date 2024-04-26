package Recursion;

public class BinaryString {
    public static void main(String[] args) {
        binary(3,0,"");
    }
    static void binary(int n, int lastplace, String str){
        //Print all binary Strings of size N without consecutive ones.
        //kaam
        //we have choice on nth place that we can take 0 or 1 on nth place. and then call the function 
       // for n-1  place. by passing last digit .
        if(n == 0){
            System.out.println(str);
            return;
        }

        // if(lastplace == 0){
        //     sit 0 on chair n
        //     binary(n-1, 0, str+"0");
        //     binary(n-1, 1, str+"1");
        // }else{
        //     if last place is 1
        //     binary(n-1, 0, str+"0");
        // }

        binary(n-1, 0, str+"0");
        if(lastplace == 0){
            binary(n-1, 1, str+"1");
        }
    }
}
