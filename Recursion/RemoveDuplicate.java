package Recursion;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int idx = 0;
        String s = "appnnacollege";
        boolean map []= new boolean[26];
        StringBuilder sb = new StringBuilder();
        Remove(idx, s,sb,map);
    }
    static void Remove(int idx,String s ,StringBuilder sb ,boolean map[]){
        //base case ;
        if(idx == s.length()){
            System.out.println(sb.toString());
            return;
        }

        char c = s.charAt(idx);
        if(map[c - 'a'] == true){
            Remove(idx+1, s, sb, map);
        }
        else{
            map[c - 'a'] = true;
            Remove(idx + 1, s,sb.append(c),map);
        }
    }
}
