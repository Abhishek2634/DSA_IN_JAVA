package Tries;

public class LongestWordWithAllPrefixes {
    public static class Node {
        Node child[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < child.length; i++) {
                child[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.child[idx] == null) {
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }

    static String answer = "";

    public static String ans(Node root, StringBuilder str) {
        if (root == null)
            return "";
        for (int i = 0; i < 26; i++) {
            if (root.child[i] != null && root.child[i].eow) {
                    str.append((char)(i + 'a'));
                    answer = str.length() > answer.length() ? str.toString() : answer;
                    ans(root.child[i],str);
                    str.deleteCharAt(str.length() - 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] word = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        System.out.println(ans(root,new StringBuilder()));
    }
}