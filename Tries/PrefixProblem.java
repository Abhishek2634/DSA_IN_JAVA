package Tries;

public class PrefixProblem {
    static class Node {
       Node child[] = new Node[26];
        boolean eow = false;
        int freq = 1;
        Node(){
            for(int i = 0; i < child.length;i++){
                child[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert (String word){
        Node curr = root;
        for(int i = 0; i < word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.child[idx] == null){
                curr.child[idx] = new Node();
            }else{
                curr.child[idx].freq++;
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }
    public static void findPrefix(Node root, String ans){
        if(root == null ) return;
        if(root.freq == 1){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < root.child.length;i++){
            if(root.child[i] != null){
                findPrefix(root.child[i], ans+(char)('a'+i));
            }
        }
    }
    public static void main(String[] args) {
        // find the shortest unique prefix for each word in a given list . Assume no word is prefix of another.
        String arr[] = {"zebra","duck","dove","dog"};
        for(int i = 0; i < arr.length;i++){
            insert (arr[i]);
        }
        root.freq = -1;
        findPrefix (root,"");
    }
}
