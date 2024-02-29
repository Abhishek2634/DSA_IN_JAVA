package Strings;

public class compareTo {
    public static void main(String[] args) {
        String arr [] = {"mango","banana","papaya"};
        String large = arr[0];
        for(int i = 1 ; i < arr.length;i++){
            if(large.compareTo(arr[i])<0){
                large = arr[i];
            }
        }
        System.out.println(large);
    }
}

// check the largest string in lexographical order.

//compareToIgnoreCase() method ignore the uppercase or lowercase string in java.

