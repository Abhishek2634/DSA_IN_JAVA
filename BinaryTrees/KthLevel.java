package BinaryTrees;

public class KthLevel {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }
    public static void KLevel(Node root,int level,int k){
        if(level == k){
            System.out.print(root.data + " ");
            return;
        }
        KLevel(root.left, level+1, k);
        KLevel(root.right,level+1,k);

    }
    public static void main(String[] args) {
        Node root = new Node (1);
        root.left = new Node (2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node (5);
        root.right.left = new Node (6);
        root.right.right = new Node (7);

        KLevel(root,1,3);

    }
}
