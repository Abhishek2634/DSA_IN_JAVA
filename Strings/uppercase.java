package Strings;

import java.util.Scanner;

public class uppercase {
    static void upper(String s){
        StringBuilder sb = new StringBuilder(" ");
        for(int i = 0; i < s.length();i++){
            if(i==0){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
             else if(s.charAt(i) == ' ' && i < s.length()-1) {
                sb.append(' ');
                i++;
                 sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else sb.append(s.charAt(i));
        }
        String ans = sb.toString();
        System.out.println(ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter a string");
        String s =  sc.nextLine();
        sc.close();
        upper(s);
    }
}
