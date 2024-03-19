package Tries;

public class WordBreakProblem {
    public static class Node{
        Node arr [] = new Node[26];
        boolean eow = false;
        Node(){
            for(int i = 0; i < arr.length;i++){
                arr[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert (String word){
        Node curr = root;
        for(int i = 0; i < word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.arr[idx] == null){
                curr.arr[idx] = new Node();
            }
            curr = curr.arr[idx];
        }
        curr.eow = true;
    }
    public static boolean search (String word){
        Node curr = root;
        for(int i = 0; i < word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.arr[idx] == null){
                return false;
            }
            curr = curr.arr[idx];
        }
       return curr.eow;
    }
    public static boolean wordBreak(String s){
        if(s.length() == 0){
            return true;
        }
        for(int i = 1; i <= s.length();i++){
            String str = s.substring(0, i);
            if(search(str) && wordBreak(s.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String arr[] = {"i","like","sam","samsung","mobile","ice"};
        String s = "ilikesamsung";
        for(int i = 0; i < arr.length;i++){
            insert(arr[i]);
        }
       System.out.println( wordBreak(s));
    }
}
