package Strings;

public class immutable {
    static void check(String s){
       String newStr = s.concat(" hello");
        System.out.println(newStr);
    }
    public static void main(String[] args) {
        String s = "hello world";
        check(s);
    }

}
