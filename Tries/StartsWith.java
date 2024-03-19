package Tries;

public class StartsWith {
    public static class Node{
       Node child[] = new Node[26];
       Node(){
        for(int i = 0; i < child.length;i++){
            child[i] = null;
        }
       }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i = 0; i < word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.child[idx] == null){
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
    }
    public static boolean startsWith(String prefix){
        Node curr = root;
        for(int i = 0; i < prefix.length();i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.child[idx] != null){
                curr = curr.child[idx];
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String word[] = {"apple","app","mango","man","woman"};
        for(int i = 0; i < word.length;i++){
            insert(word[i]);
        }
        String prefix = "apple";

       System.out.println( startsWith(prefix));
    }
}
