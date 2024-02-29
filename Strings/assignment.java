package Strings;


public class assignment {
    static void intern(){
        String str = "hello";
        String str1 = new String ("hello");
        String str2 = str1.intern();
        System.out.println(str== str1);
        System.out.println(str== str2);
    }
    static void replace(){
        String s ="abhikhek";
        String m = s.replace("k","a");
        System.out.println(m);
    }
    static void countVowels(){
        String a = "aeioumaster";
        int count = 0;
        for(int i = 0; i < a.length();i++){
            char ch = a.charAt(i);
            if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
                count ++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
       //replace;
       replace();

        //intern
        intern();

        countVowels();
    }
}
