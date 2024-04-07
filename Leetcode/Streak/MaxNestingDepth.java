import java.util.Stack;

public class MaxNestingDepth {
    public static void main(String[] args) {
        String s = "(1 + (2 + 3)+ ((8)/4))+1";
        // stack method
        int ans = 0;
        if(s.equals("")){
            System.out.println(0);
            return;
        } 
        Stack <Character> st = new Stack<>();
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == '(') st.push('(');
            else if (s.charAt(i) == ')')st.pop();
            ans = Math.max(ans,st.size());
        }
        System.out.println(ans);
    }
}
