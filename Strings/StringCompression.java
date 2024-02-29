package Strings;

public class StringCompression {
    static void count (String s){
        StringBuilder sb = new StringBuilder();
        int [] arr = new int [26];
            for(int i = 0; i < s.length();i++){
                char ch = s.charAt(i);
                arr[ch - 'a']++;
            }
            for(int i = 0; i < s.length();i++){
                char ch = s.charAt(i);
                if(arr[ch-'a'] > 0){
                    if(arr[ch-'a'] == 1){
                        sb.append(ch);
                    }
                    else{
                        sb.append(ch);
                        sb.append(arr[ch-'a']);
                        arr[ch-'a'] = 0;
                    }
                }
            }
        
        System.out.println(sb.toString());
    }

    static void another(String str){
        int count = 1;
        String s = "";
        for(int i = 0;i < str.length();i++){
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
                i++;
            }
            s+=str.charAt(i);
            if(count > 1) {
                s += count;
                count = 1;
            }
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        String str = "aaabgmmstccd";
        count(str);
        // another(str);

    }
}
