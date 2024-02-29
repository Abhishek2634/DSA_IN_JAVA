package Recursion;

public class StringStartAndEnd {
    public static void main(String[] args) {
        //need to find out substring end and start with same characters;
        String s = "abcba";
        int arr[] = new int[26];
        int ans = 0;
        for(int i = 0; i < s.length();i++){
            int t = s.charAt(i) - 'a';
            ans += ++arr[t];
        }
        System.out.println(ans);
    }
}
