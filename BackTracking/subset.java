package BackTracking;

public class subset {
    public static void main(String[] args) {
        // t.c -> O(2**n * n) where n is the time taken to calculate n subset.and  2^n is for one subset.
        // s.c -> O(N) call stack
        String s = "abc";
        findSubset(s, "", 0);
    }

    public static void findSubset(String s, String ans, int i) {
        //base case;
        if(i == s.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else
            System.out.println(ans);
            return;
        }
        findSubset(s, ans+s.charAt(i), i+1);
        findSubset(s, ans, i+1);

    }
}