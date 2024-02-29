package Stack;

import java.util.Stack;

public class ReverseString {
    static String reverse(String m){
        Stack <Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int idx = 0; 
        while(idx < m.length()){
            stack.push(m.charAt(idx));
            idx++;
        }
        while(!stack.isEmpty()){
            char c = stack.pop();
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "racecar";
        String ans = reverse(s);
        System.out.println(ans.equals(s));
    }
}
