package BinaryTrees;

public class KthAncestor {
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
    public static int kAncestor(Node root,int k,int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = kAncestor(root.left, k, n);
        int rightDist = kAncestor(root.right , k, n);
        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if(max + 1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static void main(String[] args) {
        Node root = new Node (1);
        root.left = new Node (2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node (5);
        root.right.left = new Node (6);
        root.right.right = new Node (7);

        int k = 1;
        int n = 5;
        kAncestor(root,k,n);
    }
}
