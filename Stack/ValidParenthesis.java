package Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "(([]))";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s){
        Stack <Character> m = new Stack<>();
        for(int i = 0; i < s.length();i++){
            char a = s.charAt(i);
            if(a == '(' || a == '{' || a == '['){
                m.push(a);
            }else{
                if(m.isEmpty()) return false;
                else if((m.peek() == '(' && a == ')') || (m.peek() == '[' && a == ']') || (m.peek() == '{' && a == '}')){
                    m.pop();
                }else{
                    return false;
                }
            }
        }
        if(!m.isEmpty()){
            return false;
        } 
        else{
            return true;
        }
        
    }
}
