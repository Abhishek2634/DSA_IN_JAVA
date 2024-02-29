package Strings;

public class revision {
    static String substring(String s, int si,int ei){
        // System.out.println(s.substring(si,ei));
        String str = "";
        for(int i = si; i < ei;i++){
            str += s.charAt(i);
        }
        return str;
    }
    public static void main(String[] args) {
        String m = "abhishek";
        String s = new String("abhishek");
        int si = 0; 
        int ei = 4;
        System.out.println(substring(m,si,ei));
        System.out.println(m.charAt(3));
        System.out.println(m.equals(s));
    }
}
