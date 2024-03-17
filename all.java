public class all {
    public static void main(String[] args) {
        String s = "abc";
        String e = " ";
        int ans = 0;
        check(s,e,ans);
    }
    static void check(String s, String e,int ans){
        if(ans ==  s.length()){
            System.out.println(e);
            return ;
        }
        check(s, e + s.charAt(ans), ans+1);
        check(s, e, ans+1);
    }
}
