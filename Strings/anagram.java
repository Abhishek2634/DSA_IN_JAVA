package Strings;
import java.util.Arrays;
public class anagram {
    static void another(String s, String m){
         char arr [] = s.toCharArray();
        char arr1 [] = m.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(Arrays.equals(arr, arr1));

    }
    public static void main(String[] args) {
        String s = "anagram";
        String m = "naagram";
        another(s,m);
        if(s.length() != m.length()){
            System.out.println("they are not anagram of each other");
            return;
        }

        int arr[] = new int [26];
        int arr1[] = new int [26];
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
        }
        for(int i = 0; i < m.length();i++){
            char ch = m.charAt(i);
            arr1[ch-'a']++;
        }
        for(int i = 0; i < arr.length;i++){
            if(arr[i] - arr1[i] != 0){
                System.out.println("they are not anagrams of each other");
                return;
            }
        }
        System.out.println("they are anagrams of each other");
        
}
}
