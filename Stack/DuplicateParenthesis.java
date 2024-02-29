package Stack;

import java.util.Stack;

public class DuplicateParenthesis {
    public static void main(String[] args) {
         String str = "((a+(b+c)+(d+e)))";
        System.out.println(ans(str));
        // System.out.println(another(str));

    }
    static boolean ans(String str){
        Stack <Character> s = new Stack<>();
        for(int i = 0; i < str.length();i++){
            char m = str.charAt(i);
            int count = 0;
            while(m == ')' && !s.isEmpty()){
                if(s.peek() == '('){
                    if(count == 0) return true;
                    else{
                        s.pop();
                        break;
                    }
                }else{
                    count++;
                    s.pop();
                }
            }
                if(count == 0){
                    s.push(m);
                }
            

        }
        return false;
    }

    static boolean another(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length();i++){
            char a = str.charAt(i);
            if(a == ')'){
                int count = 0;
                while(s.pop() != '('){
                    count++;
                }
                if(count == 0) return true;
            }else{
                s.push(a);
            }
        }
        return false;
    }
}
