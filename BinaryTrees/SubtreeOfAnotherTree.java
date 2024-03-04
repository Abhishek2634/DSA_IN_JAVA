package BinaryTrees;

public class SubtreeOfAnotherTree {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isIdentical(Node root,Node subroot){
        if(root == null && subroot == null){
            return true;
        }
        else if(root == null || subroot == null || root.data != subroot.data){
            return false;
        }
        if(!isIdentical(root.left, subroot.left)){
            return false;
        }
        if(!isIdentical(root.right, subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean subTree(Node root, Node subroot){
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        return subTree(root.left,subroot) || subTree(root.right,subroot);
    }

    public static void main(String[] args) {
        // Given the roots of two binary trees root and subroot , return true if there is a subtree of root with the same structure and node values of subroot and false otherwise.
        Node root = new Node (1);
        root.left = new Node (2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node (5);
        root.right.left = new Node (6);
        root.right.right = new Node (7);


        Node subroot = new Node (2);
        subroot.left = new Node(4);
        subroot.right = new Node (5);

        System.out.println(subTree(root, subroot));

    }
}
