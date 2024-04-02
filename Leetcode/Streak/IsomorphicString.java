import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "foo", t = "bar";
        System.out.println(ans(s,t));
    }
    public static boolean ans(String s, String t){
        HashMap<Character,Character>map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length();i++){
            map1.put(s.charAt(i),t.charAt(i));
            map2.put(t.charAt(i),s.charAt(i));
        }
        for(int i = 0; i < s.length();i++){
            if(map1.get(s.charAt(i)) == t.charAt(i) && map2.get(t.charAt(i)) == s.charAt(i)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
