package Strings;

public class palindrome {
    static void check (String str){
        int i = 0; 
        int j = str.length()-1;
        while(str.charAt(i) == str.charAt(j) && i <= j){
            if(i == j || i+1 == j){
                System.out.println("it is  palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.print("it is not a palindrome");

    }
    static boolean another(String str){
        int n = str.length();
        for(int i = 0; i < n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "noon";
        check(str);
        System.out.println(another(str));
}
}
