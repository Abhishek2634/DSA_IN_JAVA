package BinaryTrees;

import java.util.ArrayList;
public class ConvertBstToBalancedBst {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void GetInOrder(Node root, ArrayList<Integer>inorder){
        if(root == null){
            return;
        }
        GetInOrder(root.left, inorder);
        inorder.add(root.data);
        GetInOrder(root.right, inorder);
    }
    public static Node balancedBst(Node root){
        //inorder seq.
        ArrayList <Integer> inorder = new ArrayList<>();
        GetInOrder(root,inorder);
        // sorted inorder --> balanced bst 
        root = createBst(inorder, 0, inorder.size()-1);
        return root;
    }
    public static Node createBst(ArrayList<Integer>inorder,int st,int end){
        if(st > end){
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBst(inorder, st, mid-1);
        root.right = createBst(inorder,mid+1,end);
        return root;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        // balance bst is a bst in which there is min height of the tree exists.
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

       root = balancedBst(root);
        preOrder(root);
    }
}
