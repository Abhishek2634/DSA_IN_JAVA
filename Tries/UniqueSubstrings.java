package Tries;

public class UniqueSubstrings {
    public  static class Node {
        Node child[]  = new Node[26];
        Node(){
            for(int i = 0;i < child.length;i++){
                child[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert (String m){
        Node curr = root;
        for(int i = 0; i < m.length();i++){
            int idx = m.charAt(i) - 'a';
            if(curr.child[idx] == null){
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;
        for(int i = 0; i < 26;i++){
            if(root.child[i] != null){
                count += count(root.child[i]);
            }
        }
        return count + 1;
    }
    public static void main(String[] args) {
        //count unique substrings
        // step 1
        // find all suffix of string;
        // step 2
        // create TRIE + insert;
        // step 3;
        // count nodes of trie;  TRIE stores unique prefix of all strings;

        String s = "ababa";
        for(int i = 0; i < s.length();i++){
            String a = s.substring(i);
            insert(a);
        }
        System.out.println(count(root));
    }
}
