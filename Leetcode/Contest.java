package Leetcode;
import java.util.*;

public class Contest {
    public static void uncommon(String arr[]){
        int n = arr.length;
        String ans [] = new String[n];
        for(int i = 0; i < n;i++){
            String a = "";
            for(int j = 0; j < arr[i].length();j++){
                inner:
                for(int k = j+1;k <= arr[i].length();k++){
                    String s = arr[i].substring(j,k);
                    for(int l = 0; l < n;l++){
                        if(i == l)continue;
                        if(arr[l].contains(s)){
                            continue inner;
                        }
                    }
                    if(a == "" || a.length() > s.length() || (a.length() == s.length() && s.compareTo(a) < 0)){
                        a = s;
                    }
                }
            }
            if(a == ""){
                ans[i] = "";
            }else
            ans[i] = a;
        }
        System.out.print(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        //shortest uncommon string in an array.
        String arr[] = {"cab","ad","bad","c"};  // ans = {"ca","","ba",""};
        uncommon(arr);
    }
}
