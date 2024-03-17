public class ValidAnagram {
    public static void main(String[] args) {
        String a = "raca";
        String b = "care";
        System.out.println(check(a,b));

    }
    static boolean check(String a,String b){
        int freq[] = new int [26];
        int freq1[] = new int [26];
        if(a.length() != b.length()){
            return false;
        }
        for(int i = 0;i < a.length();i++){
            freq[a.charAt(i) - 'a']++;
            freq1[b.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26;i++){
            if(freq[i] != freq1[i]) return false;

        }
        return true;
    }
}
