import java.util.*;
public class MinRemoveToMakeValidString {
    public static void main(String[] args) {
        String m = "lee(t(c)o)de)";
        System.out.println(first(m));
        System.out.println(second(m));
    }
    public static String second(String m){
        int open = 0;
        int close = 0;
        char ch[] = m.toCharArray();
        for(int i = 0; i < ch.length;i++){
            char d = ch[i];

            if(d == '(') open ++;
            else if (d == ')') close ++;
            if(close > open && d == ')'){
                close --;
                ch[i] = '*';
            } 
        }
        for(int i = ch.length - 1; i >= 0;i--){
            char h = ch[i];
            if( open > close && h == '('){
                open--;
                ch[i] = '*';
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ch.length;i++){
            if(ch[i] != '*') {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
    public static String first(String m){
        Stack<Character> st = new Stack<>();
        int open = 0;
        int close = 0;
        for(int i = 0;i < m.length();i++){
            char d = m.charAt(i);
            if(d == '(') open ++;
            else if (d == ')') close ++;

            if(close > open){
                close --;
                continue;
            }else{
                st.push(d);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            char h = st.pop();
            if(open > close && h == '('){
                open--;
            }else{
                sb.append(h);
            }
        }
        return sb.reverse().toString();
    }
}
