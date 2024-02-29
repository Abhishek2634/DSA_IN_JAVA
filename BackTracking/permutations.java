package BackTracking;

public class permutations {
    public static void main(String[] args) {
        //no. of permutations for n characters is n!;

        String s = "abc";
        permutation(s,"");
    }
   public static void permutation(String s ,String ans){
    // t.c - > O(n! * n) total permutation * time for one permutation.
    // s.c - > O(N);
       if(s.length() == 0){
        System.out.println(ans);
        return;
       }                                                                                                    

       
        //recursion
        for(int i = 0; i < s.length();i++){
            char curr = s.charAt(i);
            String newStr = s.substring(0, i) + s.substring(i+1);
            permutation(newStr, ans+curr);
        }
    } 
}
