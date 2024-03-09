package BST;
import java.util.*;

public class Root2LeafPath {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            //left subtree;
            root.left = insert(root.left,val);
        }else{
            //right subtree;
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }
    public static void printPath(ArrayList<Integer>Path){
        for(int i = 0; i < Path.size();i++){
            System.out.print(Path.get(i) + "-->");
        }
        System.out.println("NULL");
    }
    public static void Paths(Node root,ArrayList<Integer>path){
        if(root == null){
            return ;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        Paths(root.left,path);
        Paths(root.right,path);
        path.remove(path.size()-1);
    }
    public static void main(String []args){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0; i < values.length;i++){
            root = insert(root,values[i]);
        }
        Paths(root,new ArrayList<>());
    }
}
