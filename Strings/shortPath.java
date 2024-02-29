package Strings;

public class shortPath {
   static void ans(String str){
    int X = 0;
    int Y = 0;
    for(int i = 0 ;i < str.length();i++){
        if(str.charAt(i) == 'N'){
            Y++;
        }
        else if(str.charAt(i) == 'S'){
            Y--;
        }
        else if(str.charAt(i) == 'W'){
            X--;
        }
        else if(str.charAt(i) == 'E'){
            X++;
        }
    }
    System.out.println(Math.sqrt(X*X+Y*Y));
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        ans(str);
    }
}
